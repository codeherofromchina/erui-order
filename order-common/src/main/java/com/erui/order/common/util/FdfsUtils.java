package com.erui.order.common.util;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.csource.common.MyException;
import org.csource.fastdfs.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;

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


    public static String[] dfsUpload(byte[] fileBuff, String fileExtName) throws IOException, MyException {
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
}
