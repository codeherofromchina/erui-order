package com.erui.order.service.impl;

import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.FastdfsFileMapper;
import com.erui.order.model.entity.FastdfsFile;
import com.erui.order.model.entity.FastdfsFileExample;
import com.erui.order.service.FastdfsFileService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/12 上午12:57
 */
@Service
@Transactional
public class FastdfsFileFileServiceImpl implements FastdfsFileService {
    private static final Logger LOGGER = LoggerFactory.getLogger(FastdfsFileFileServiceImpl.class);
    @Autowired
    private FastdfsFileMapper fastdfsFileMapper;

    @Override
    public void insert(String group, String fileId, String originalFilename, Long size) {
        try {
            FastdfsFile fastdfsFile = new FastdfsFile();
            fastdfsFile.setDfsGroup(group);
            fastdfsFile.setFileid(fileId);
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
            LOGGER.error("保存fastdfs文件错误 - {} - {} - {} - {}", group, fileId, originalFilename, e.toString());
        }
    }


    @Override
    public String findFileName(String group, String fileId) {
        if (StringUtils.isAnyBlank(group, fileId)) {
            return null;
        }
        FastdfsFileExample example = new FastdfsFileExample();
        example.createCriteria().andDfsGroupEqualTo(group).andFileidEqualTo(fileId);
        List<FastdfsFile> fastdfsFiles = fastdfsFileMapper.selectByExample(example);
        if (fastdfsFiles != null && fastdfsFiles.size() > 0) {
            return fastdfsFiles.get(0).getOriginalFilename();
        }
        return null;
    }
}
