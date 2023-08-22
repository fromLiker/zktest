package com.example.zktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class ZktestApplication {

	public static void main(String[] args) {
		System.setProperty("zookeeper.sasl.client", "false");
		SpringApplication.run(ZktestApplication.class, args);
	}

}
