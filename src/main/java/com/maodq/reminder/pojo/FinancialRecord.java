package com.maodq.reminder.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FinancialRecord {
    // CREATE TABLE `financial_record`(
    //    `id` INT(11) UNSIGNED PRIMARY KEY AUTO_INCREMENT NOT NULL,
    //    `create_time` TIMESTAMP NOT NULL,
    //    `name` VARCHAR(22) NOT NULL,
    //    `price` FLOAT  UNSIGNED NOT NULL,
    //    `count` INT UNSIGNED NOT NULL,
    //    `type` CHAR DEFAULT '',
    //    `note` VARCHAR(100)
    //) ENGINE=InnoDB DEFAULT CHARSET=utf8;

//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private String name;
    // It's 分 not 元
    private int price;
    private int count;
    private String type;
    private String note;
}
