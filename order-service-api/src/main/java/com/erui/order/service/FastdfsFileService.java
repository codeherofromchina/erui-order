package com.erui.order.service;

/**
 * @Auther 王晓丹
 * @Date 2019/9/12 上午12:56
 */
public interface FastdfsFileService {

    void insert(String group, String fileid, String originalFilename, Long size);
}
