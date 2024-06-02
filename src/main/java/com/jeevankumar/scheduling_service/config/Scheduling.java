package com.jeevankumar.scheduling_service.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Scheduling {

    @Scheduled(cron = "0 1 * * * *")
    public void firstTask(){
        System.out.println("Task is executed every 1 minute: " + LocalDateTime.now());
    }
}
