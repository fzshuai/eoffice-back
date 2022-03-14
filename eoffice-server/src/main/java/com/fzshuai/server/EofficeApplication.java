package com.fzshuai.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author fzshuai
 * @date 2022/03/13 15:34
 * @since 1.0
 */
@SpringBootApplication
@MapperScan("com.fzshuai.server.mapper")
public class EofficeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EofficeApplication.class, args);
    }
}
