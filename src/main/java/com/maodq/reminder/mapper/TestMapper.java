package com.maodq.reminder.mapper;

import com.maodq.reminder.pojo.FRTest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<FRTest> selectTest();
}
