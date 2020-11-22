package com.maodq.reminder.service;

import com.maodq.reminder.pojo.FinancialRecord;

import java.util.List;

public interface FinancialService {
    void insertRecord(FinancialRecord record);

    List<FinancialRecord> getAllFinancialRecords();
}
