package com.example.zktest.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName Zktestcontroller
 * @Description TODO
 * @Author Liker
 * @Date 2023-07-27 03:46:38
 */
@RestController
@Slf4j
public class Zktestcontroller {
    @Value("${server.port}")
    private String serverPort;
    
    @GetMapping(value = "/zk/test")
    public String paymentzk()
    {
        return "springcloud with zookeeper: "+serverPort+"\t"+ UUID.randomUUID().toString();//UUID这个是流水号，每次点击都不一样(UUID导java.uitl包的)
    }
    
    @GetMapping("/helloworld")
    public String HelloWorld() {
        return "Hello World!";
    }

}
