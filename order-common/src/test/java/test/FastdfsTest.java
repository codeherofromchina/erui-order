package test;

import org.csource.common.MyException;
import org.csource.fastdfs.*;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @Auther 王晓丹
 * @Date 2019/9/2 下午6:12
 */
public class FastdfsTest {
    private TrackerClient trackerClient = null;
    @Before
    public void setUp(){
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

    @Test
    public void testdfsUpload() throws IOException, MyException {
        TrackerServer trackerServer = null;
        StorageServer storageServer = null;
        StorageClient storageClient = null;
        try {
            trackerServer = trackerClient.getConnection();
            storageServer = trackerClient.getStoreStorage(trackerServer, "group1");
            storageClient = new StorageClient(trackerServer, storageServer);
            String[] strings = storageClient.upload_file("/Users/wangxiaodan/tmp/fastdfs/favicon.ico", "jpg", null);
            for (String str : strings) {
                System.out.println(str);
            }
        } finally {
            if (storageServer != null){
                try {
                    storageServer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (trackerServer != null){
                try {
                    trackerServer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            storageClient = null;
        }
    }

    @Test
    public void testdfsDownload() throws IOException, MyException {
        TrackerServer trackerServer = null;
        StorageServer storageServer = null;
        StorageClient1 storageClient = null;
        String fileName = "/Users/wangxiaodan/tmp/fastdfs/favicon2.ico";
        String groupName = "group1";
        String fileId = "/M00/00/00/rBIXK11t7c2ABYYEAAAEfiN1vvk474.jpg";
        try {
            trackerServer = trackerClient.getConnection();
            storageServer = trackerClient.getStoreStorage(trackerServer);
            storageClient = new StorageClient1(trackerServer, storageServer);
            byte[] bytes = storageClient.download_file1( groupName + fileId);
            if (bytes != null) {
                OutputStream outputStream = new FileOutputStream(new File(fileName));
                outputStream.write(bytes);
                outputStream.close();
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (storageServer != null){
                try {
                    storageServer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (trackerServer != null){
                try {
                    trackerServer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            storageClient = null;
        }


    }

    @Test
    public void testdfsDelete() throws IOException, MyException {
        TrackerServer trackerServer = null;
        StorageServer storageServer = null;
        StorageClient1 storageClient = null;
        String groupName = "group1";
        String fileId = "/M00/00/00/rBIXK11t7c2ABYYEAAAEfiN1vvk474.jpg";
        try {
            trackerServer = trackerClient.getConnection();
            storageServer = trackerClient.getStoreStorage(trackerServer);
            storageClient = new StorageClient1(trackerServer, storageServer);
            int result = storageClient.delete_file1(groupName + fileId);
            System.out.println(result);
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (storageServer != null){
                try {
                    storageServer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (trackerServer != null){
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
