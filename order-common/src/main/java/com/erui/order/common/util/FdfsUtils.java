package com.erui.order.common.util;

import org.csource.common.MyException;
import org.csource.fastdfs.*;

import java.io.IOException;

/**
 * @Auther 王晓丹
 * @Date 2019/9/3 下午1:14
 */
public class FdfsUtils {
    private static TrackerClient trackerClient = null;

    static {
        try {
            ClientGlobal.init("/etc/fdfs/client.conf");
            TrackerGroup trackerGroup = ClientGlobal.g_tracker_group;
            trackerClient = new TrackerClient(trackerGroup);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    /**
     * 上传文件到fastdfs
     *
     * @param fileBuff
     * @param fileExtName
     * @return
     * @throws IOException
     * @throws MyException
     */
    public static String[] fdfsUpload(byte[] fileBuff, String fileExtName) throws IOException, MyException {
        TrackerServer trackerServer = null;
        StorageServer storageServer = null;
        StorageClient storageClient = null;
        try {
            trackerServer = trackerClient.getConnection();
            storageServer = trackerClient.getStoreStorage(trackerServer, "group1");
            storageClient = new StorageClient(trackerServer, storageServer);
            String[] strings = storageClient.upload_file(fileBuff, fileExtName, null);
            return strings;
        } finally {
            if (storageServer != null) {
                try {
                    storageServer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (trackerServer != null) {
                try {
                    trackerServer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            storageClient = null;
        }
    }

    /**
     * 下载fdfs中的文件
     *
     * @param group
     * @param fileId
     * @return
     * @throws IOException
     * @throws MyException
     */
    public static byte[] fdfsDownload(String group, String fileId) throws IOException, MyException {
        TrackerServer trackerServer = null;
        StorageServer storageServer = null;
        StorageClient1 storageClient = null;
        String fileName = "/Users/wangxiaodan/tmp/fastdfs/favicon2.ico";
        try {
            trackerServer = trackerClient.getConnection();
            storageServer = trackerClient.getStoreStorage(trackerServer);
            storageClient = new StorageClient1(trackerServer, storageServer);
            byte[] fileBuff = storageClient.download_file1(String.format("%s/%s", group, fileId));
            return fileBuff;
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (storageServer != null) {
                try {
                    storageServer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (trackerServer != null) {
                try {
                    trackerServer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            storageClient = null;
        }
    }
}
