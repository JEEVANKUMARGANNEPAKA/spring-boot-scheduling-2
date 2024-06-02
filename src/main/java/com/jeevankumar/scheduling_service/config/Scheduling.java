package com.jeevankumar.scheduling_service.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Component
@RestController
public class Scheduling {
    Logger logger = LoggerFactory.getLogger(Scheduling.class);

//    @Scheduled(cron = "0 */5 * * * ?")
//    public void firstTask(){
//        System.out.println("Task is executed every 1 minute: " + LocalDateTime.now());
//    }
    @GetMapping(value = "/log")
    public void log(){
    logger.info("this is logger information");
    logger.warn("This is warn message");
    logger.debug("This is debug ");
    logger.error("This is error message");
    logger.trace("This is trace message");
    }
}
