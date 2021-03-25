package com.max.reminder;

import com.max.reminder.dao.Repositories;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootTest
class ReminderApplicationTests {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private Repositories.Financial financialRepository;

    @Test
    void contextLoads() {
        System.out.println(financialRepository.findAll());
    }

}
