package com.kou.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JIAJUN KOU
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    //接口： http://localhost:8080/hello/test

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        //这个地方就是需要，调用业务层，接受前端数据

        return "hello Springboot for 寇爷爷";
    }
}
