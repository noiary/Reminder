package com.maodq.reminder;

import com.maodq.reminder.mapper.FinancialRecordMapper;
import com.maodq.reminder.pojo.FinancialRecord;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@SpringBootTest
class ReminderApplicationTests {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private FinancialRecordMapper financialRecordMapper;

    @Test
    void contextLoads() throws SQLException {
//        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String format = dateFormatter.format(new Date());
//        Date date = new Date(new java.util.Date().getTime());
//        FinancialRecord record = new FinancialRecord(date, "test", (int) (0.5f * 100), 5, "test", "This is a test record");
//        financialRecordMapper.addRecord(record);

        System.out.println(financialRecordMapper.getAllRecords());
    }

}
