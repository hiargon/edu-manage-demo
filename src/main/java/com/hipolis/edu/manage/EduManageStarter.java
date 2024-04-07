package com.hipolis.edu.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @className: EduManageStarter
 * @description:
 * @author: hipolis
 * @create: 2024-04-07 22:01
 **/
@SpringBootApplication
@MapperScan("com.hipolis.edu.manage.mapper")
public class EduManageStarter {

    public static void main(String[] args) {
        SpringApplication.run(EduManageStarter.class, args);
    }
}
