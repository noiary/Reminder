package com.maodq.reminder.mapper;

import com.maodq.reminder.pojo.FinancialRecord;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FinancialRecordMapper {
    @Select("INSERT INTO financial_record(create_time, name, price, count, type, note) VALUES(#{createTime}, #{name}, #{price}, #{count}, #{type}, #{note})")
    void addRecord(FinancialRecord record);

    @Select("SELECT * FROM financial_record")
    @Result(property = "createTime", column = "create_time")
    List<FinancialRecord> getAllRecords();
}
