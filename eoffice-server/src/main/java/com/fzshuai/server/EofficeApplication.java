package com.fzshuai.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动类
 *
 * @author fzshuai
 * @date 2022/03/13 15:34
 * @since 1.0
 */
@SpringBootApplication
@EnableScheduling
public class EofficeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EofficeApplication.class, args);
    }
}
