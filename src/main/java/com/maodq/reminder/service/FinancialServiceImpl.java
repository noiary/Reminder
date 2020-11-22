package com.maodq.reminder.service;

import com.maodq.reminder.mapper.FinancialRecordMapper;
import com.maodq.reminder.pojo.FinancialRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
