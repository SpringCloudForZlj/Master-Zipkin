package com.xd.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * Created by 张立军 on 2020/1/14.
 * Project Name : SpringCloud
 * Package Name : com.xd.zipkin
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer //开启zipkin server功能
public class ZipKinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class,args);
    }
}
