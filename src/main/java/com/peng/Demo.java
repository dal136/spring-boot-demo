package com.peng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by penghaibing on 2018/3/24 12:02.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Demo{

    public static void main(String[] args) {
        SpringApplication.run(Demo.class, args);
    }
}
