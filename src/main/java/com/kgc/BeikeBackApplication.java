package com.kgc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
@MapperScan(basePackages = {"com.kgc.dao"})
@ServletComponentScan
public class BeikeBackApplication {
    public static void main(String[] args) {
        SpringApplication.run(BeikeBackApplication.class, args);
    }
}
