package com.maodq.reminder.controller;

import com.maodq.reminder.pojo.FRTest;
import com.maodq.reminder.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/test")
public class TestController {
    @Autowired
    private TestService service;

    @GetMapping
    public List<FRTest> getTestData() {
        return service.getTestData();
    }
}
