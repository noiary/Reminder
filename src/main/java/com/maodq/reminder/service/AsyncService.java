package com.maodq.reminder.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
    @Async
    public void demo() {
        try {
            Thread.sleep(3000);
            System.out.println("Finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
