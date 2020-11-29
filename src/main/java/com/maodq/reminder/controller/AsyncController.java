package com.maodq.reminder.controller;

import com.maodq.reminder.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {
    @Autowired
    private AsyncService asyncService;

    @GetMapping("async")
    public String async() {
        asyncService.demo();
        return "Finished";
    }
}
