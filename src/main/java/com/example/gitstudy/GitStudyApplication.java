package com.example.gitstudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.gitstudy.dao")
public class GitStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitStudyApplication.class, args);
    }

}
