package com.erui.order.service.impl;

import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.FastdfsFileMapper;
import com.erui.order.model.entity.FastdfsFile;
import com.erui.order.service.FastdfsFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/12 上午12:57
 */
@Service
public class FastdfsFileFileServiceImpl implements FastdfsFileService {
    private static final Logger LOGGER = LoggerFactory.getLogger(FastdfsFileFileServiceImpl.class);
    @Autowired
    private FastdfsFileMapper fastdfsFileMapper;

    @Override
    public void insert(String group, String fileid, String originalFilename, Long size) {
        try {
            FastdfsFile fastdfsFile = new FastdfsFile();
            fastdfsFile.setDfsGroup(group);
            fastdfsFile.setFileid(fileid);
            fastdfsFile.setOriginalFilename(originalFilename);
            fastdfsFile.setFileSize(size);
            UserInfo userInfo = ThreadLocalUtil.getUserInfo();
            if (userInfo != null) {
                fastdfsFile.setCreateUserId(userInfo.getId());
            }
            fastdfsFile.setCreateTime(new Date());

            fastdfsFileMapper.insert(fastdfsFile);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("保存fastdfs文件错误 - {} - {} - {} - {}", group, fileid, originalFilename, e.toString());
        }
    }
}
