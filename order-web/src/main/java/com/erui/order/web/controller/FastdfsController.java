package com.erui.order.web.controller;

import com.erui.order.common.Result;
import com.erui.order.common.ResultStatus;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.response.FastdfsUploadResponse;
import com.erui.order.common.util.FdfsUtils;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.service.FastdfsFileService;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/12 上午12:19
 */
@RestController
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
                String[] strings = FdfsUtils.dfsUpload(file.getBytes(), FilenameUtils.getExtension(fileName));
                String group = strings[0];
                String fileid = strings[1];
                LOGGER.info("上传成功 - {} - {} ", group, fileid);
                result.setMessage("上传成功");
                FastdfsUploadResponse fastdfsUploadResponse = new FastdfsUploadResponse();
                fastdfsUploadResponse.setAttachGroup(group);
                fastdfsUploadResponse.setUrl(fileid);
                fastdfsUploadResponse.setTitle(fileName);
                fastdfsUploadResponse.setCreateTime(new Date());
                fastdfsUploadResponse.setCreateUserName(userInfo.getUserName());
                result.setData(fastdfsUploadResponse);
                fastdfsFileService.insert(group, fileid, fileName, file.getSize());
            } catch (Exception e) {
                result.setStatus(ResultStatus.FAIL);
                result.setMessage(e.getMessage());
                LOGGER.error(e.toString(), e);
            }
        }
        return result;
    }
}
