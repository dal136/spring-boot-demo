package com.peng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by penghaibing on 2018/8/15 0:05.
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String home() {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        logger.info("/hello, host：" + serviceInstance.getHost() + ", service_id:" + serviceInstance.getServiceId());
        return "Hello World";
    }
}
