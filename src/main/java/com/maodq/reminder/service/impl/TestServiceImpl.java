package com.maodq.reminder.service.impl;

import com.maodq.reminder.mapper.TestMapper;
import com.maodq.reminder.pojo.FRTest;
import com.maodq.reminder.service.TestService;
import com.maodq.reminder.utils.MybatisUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TestServiceImpl implements TestService {
    @Override
    public List<FRTest> getTestData() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TestMapper mapper = sqlSession.getMapper(TestMapper.class);
        List<FRTest> frTests = mapper.selectTest();
        log.info(frTests.toString());
        return frTests;
    }
}
