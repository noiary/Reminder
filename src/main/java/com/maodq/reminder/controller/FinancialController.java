package com.maodq.reminder.controller;

import com.maodq.reminder.pojo.FinancialRecord;
import com.maodq.reminder.service.FinancialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/v1/financial/")
public class FinancialController {
    @Autowired
    private FinancialService financialService;

    @RequestMapping("insertFinancialRecord")
    public String postBill() {
        FinancialRecord record = new FinancialRecord(new Date(), "test", (int) (0.5f * 100), 5, "test", "This is a test record");
        financialService.insertRecord(record);
        return "success";
    }

    @GetMapping("financialRecords")
    public Object getFinancialRecords() {
        return financialService.getAllFinancialRecords();
    }
}
