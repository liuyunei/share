package com.szce.ps.web.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by szce on 2016/11/1.
 */
@Component
public class TestTaskImpl {

    @Scheduled(cron = "0 0/10 * * * ?")
    public void test() {
        System.out.println("Task");
    }

}
