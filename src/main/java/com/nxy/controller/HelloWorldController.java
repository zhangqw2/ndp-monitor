package com.nxy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zpr on 2018/6/8.
 */
@RestController
//http://localhost:8080/hello
public class HelloWorldController {
    private static Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
    @RequestMapping("/hello")
    public String index() {
        String statusCode = "200";
        String result = "Hello World";
        logger.info("StatusCode=[{}],Result=[{}]",statusCode,result);
        return result;
    }
}