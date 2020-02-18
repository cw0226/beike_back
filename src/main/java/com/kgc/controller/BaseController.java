package com.kgc.controller;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class BaseController {
    public String uploadFile(MultipartFile multipartFile) throws IOException {
        //文件路径
        String path = "E:\\ideaWorkspaces\\beike_first\\upload";
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdir();
        }

        //文件原名
        String fileName = multipartFile.getOriginalFilename();
        //截取文件后缀
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        //新的文件名
        String newFileName = UUID.randomUUID()+suffix;

        //存储文件
        File file = new File(path+"/"+newFileName);
        multipartFile.transferTo(file);

        return newFileName;
    }
    // 获取两个时间相差分钟数
    public long getTime(Date oldTime, Date newTime) throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long NTime =df.parse(df.format(newTime)).getTime();
        //从对象中拿到时间
        long OTime = df.parse(df.format(oldTime)).getTime();
        long diff=(NTime-OTime)/1000/60;
        return diff;
    }
}
