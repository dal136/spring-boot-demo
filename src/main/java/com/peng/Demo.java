package com.peng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by penghaibing on 2018/3/24 12:02.
 */
@RestController
@EnableAutoConfiguration
public class Demo implements EmbeddedServletContainerCustomizer{

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8088);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Demo.class, args);
    }
}
