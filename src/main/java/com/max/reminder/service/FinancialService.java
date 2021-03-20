package com.max.reminder.service;

import com.max.reminder.pojo.FinancialRecord;

import java.util.List;

public interface FinancialService {
    void insertRecord(FinancialRecord record);

    List<FinancialRecord> getAllFinancialRecords();
}
