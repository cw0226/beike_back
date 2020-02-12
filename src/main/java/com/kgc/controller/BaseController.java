package com.kgc.controller;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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
}
