package com.max.reminder

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@MapperScan("com.max.reminder.mapper")
object App {
    fun main(args: Array<String>) {
        runApplication<App>(*args) {
            setBannerMode(Banner.Mode.OFF)
        }
    }
}