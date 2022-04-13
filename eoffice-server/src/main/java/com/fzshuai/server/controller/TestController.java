package com.fzshuai.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.PipedOutputStream;

/**
 * 测试
 *
 * @author fzshuai
 * @date 2022/03/16 22:37
 * @since 1.0
 */
@RestController
public class TestController {

    @GetMapping("hello")
    public String test() {
        return "hello world!";
    }

    @GetMapping("/employee/basic/test")
    public String test2() {
        return "/employee/basic/test";
    }

    @GetMapping("/employee/advanced/test")
    public String test3() {
        return "/employee/advanced/test";
    }
}
