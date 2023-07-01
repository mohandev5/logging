package com.example.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    Logger logger = LoggerFactory.getLogger(MessageController.class);

    @GetMapping("/hello")
    public String hello(){
//        logger.info("[getMessage] info message");
//        logger.warn("[getMessage] warning messages");
//        logger.error("[getMessage] error message");
//        logger.debug("[getMessage] debug message");
        logger.trace("[getMessage] trace message");
//        System.out.println(10/0);
        return "hello world!";
    }
}
