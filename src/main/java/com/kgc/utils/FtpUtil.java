package com.kgc.utils;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

public class FtpUtil {
    //ftp服务器ip地址
    private static final String FTP_ADDRESS = "47.105.88.207";
    //端口号
    private static final int FTP_PORT = 21;
    //用户名
    private static final String FTP_USERNAME = "beike"; //
    //密码
    private static final String FTP_PASSWORD = "beike";
    //附件路径
    private static final String FTP_BASEPATH = "/home/beike/files";

    public  static String uploadFile(MultipartFile file) throws IOException {
        //获取上传的文件流
        InputStream input = file.getInputStream();
        //获取上传的文件名
        String fileName = file.getOriginalFilename();
        //截取后缀
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        //使用UUID拼接后缀，定义一个不重复的文件名
        String finalName = UUID.randomUUID()+suffix;
        FTPClient ftp = new FTPClient();
        try {
            int reply;
            ftp.connect(FTP_ADDRESS, FTP_PORT);// 连接FTP服务器
            ftp.login(FTP_USERNAME, FTP_PASSWORD);// 登录
            reply = ftp.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {    // 连接失败
                ftp.disconnect();
                return null;
            }
            ftp.setFileType(FTPClient.BINARY_FILE_TYPE);    // 设置文件类型为二进制文件
            ftp.makeDirectory(FTP_BASEPATH);    // 创建目录
            ftp.changeWorkingDirectory(FTP_BASEPATH );  // 更换工作路径到附件目录
            ftp.enterLocalPassiveMode();
            ftp.storeFile(finalName,input); // 上传文件
            input.close();  // 关闭输入流
            ftp.logout();   // 退出ftp
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
        return finalName;
    }
}
