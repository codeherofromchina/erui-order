package com.erui.order.service;

/**
 * @Auther 王晓丹
 * @Date 2019/9/12 上午12:56
 */
public interface FastdfsFileService {

    void insert(String group, String fileId, String originalFilename, Long size);

    /**
     * 获取fdfs中文件的原始名称
     * @param group
     * @param fileId
     * @return
     */
    String findFileName(String group, String fileId);
}
