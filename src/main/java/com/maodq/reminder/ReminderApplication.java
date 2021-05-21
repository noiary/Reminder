package com.maodq.reminder;

import com.maodq.reminder.pojo.Datasource;
import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ReminderApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ReminderApplication.class, args);
        init(context.getBean(Datasource.class));
    }

    private static void init(Datasource datasource) {
        // Create the Flyway instance and point it to the database
        Flyway flyway = Flyway.configure().dataSource(datasource.getUrl(), datasource.getUsername(), datasource.getPassword()).load();
        // Start the migration
        flyway.migrate();
    }
}
