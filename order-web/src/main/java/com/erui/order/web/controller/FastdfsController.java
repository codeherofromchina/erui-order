package com.erui.order.web.controller;

import com.erui.order.common.Result;
import com.erui.order.common.ResultStatus;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.response.FastdfsUploadResponse;
import com.erui.order.common.util.FdfsUtils;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.service.FastdfsFileService;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/12 上午12:19
 */
@Controller
@RequestMapping("order/fastdfs")
public class FastdfsController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DeliverConsignController.class);
    @Autowired
    private FastdfsFileService fastdfsFileService;

    @PostMapping("/upload")
    @ResponseBody
    public Result<FastdfsUploadResponse> upload(@RequestParam("file") MultipartFile file) {
        Result<FastdfsUploadResponse> result = new Result<>();
        if (file.isEmpty()) {
            LOGGER.info("文件为空");
            result.setStatus(ResultStatus.FAIL);
            result.setMessage("上传失败，请选择文件");
        } else {
            UserInfo userInfo = ThreadLocalUtil.getUserInfo();
            String fileName = file.getOriginalFilename();
            try {
                String[] strings = FdfsUtils.fdfsUpload(file.getBytes(), FilenameUtils.getExtension(fileName));
                String group = strings[0];
                String fileId = strings[1];
                LOGGER.info("上传成功 - {} - {} ", group, fileId);
                result.setMessage("上传成功");
                FastdfsUploadResponse fastdfsUploadResponse = new FastdfsUploadResponse();
                fastdfsUploadResponse.setAttachGroup(group);
                fastdfsUploadResponse.setUrl(fileId);
                fastdfsUploadResponse.setTitle(fileName);
                fastdfsUploadResponse.setCreateTime(new Date());
                fastdfsUploadResponse.setCreateUserName(userInfo.getUserName());
                result.setData(fastdfsUploadResponse);
                fastdfsFileService.insert(group, fileId, fileName, file.getSize());
            } catch (Exception e) {
                result.setStatus(ResultStatus.FAIL);
                result.setMessage(e.getMessage());
                LOGGER.error(e.toString(), e);
            }
        }
        return result;
    }


    @GetMapping("/download")
    @ResponseBody
    public Result<Void> download(HttpServletResponse response, @RequestParam(value = "group", required = true) String group, @RequestParam(value = "fileId", required = true) String fileId) {
        Result<Void> result = new Result<>();
        String fileName = fastdfsFileService.findFileName(group, fileId);
        try {
            if (StringUtils.isNotBlank(fileName)) {
                byte[] bytes = FdfsUtils.fdfsDownload(group, fileId);
                fileName = new String(fileName.getBytes("GB2312"), "ISO8859-1");
                response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
                ServletOutputStream outputStream = response.getOutputStream();
                outputStream.write(bytes);
                outputStream.flush();
                return null;
            } else {
                result.setStatus(ResultStatus.FAIL);
                result.setMessage("文件不存在");
            }
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("fdfs文件下载错误 - {} - {} - {}", group, fileId, e.toString());
            result.setStatus(ResultStatus.FAIL);
            result.setMessage("文件下载错误");
        }

        return result;
    }
}
