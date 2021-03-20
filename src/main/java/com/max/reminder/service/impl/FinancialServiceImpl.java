package com.max.reminder.service.impl;

import com.max.reminder.mapper.FinancialRecordMapper;
import com.max.reminder.pojo.FinancialRecord;
import com.max.reminder.service.FinancialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialServiceImpl implements FinancialService {
    @Autowired
    private FinancialRecordMapper financialRecordMapper;

    @Override
    public void insertRecord(FinancialRecord record) {
        financialRecordMapper.addRecord(record);
    }

    @Override
    public List<FinancialRecord> getAllFinancialRecords() {
        return financialRecordMapper.getAllRecords();
    }
}
