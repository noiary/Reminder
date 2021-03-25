package com.max.reminder.controller

import com.max.reminder.common.Enums
import com.max.reminder.pojo.Entities
import com.max.reminder.service.FinancialService
import com.max.reminder.util.DateUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/financial/")
class FinancialController {
    @Autowired
    private lateinit var financialService: FinancialService

    @PostMapping("insertFinancialRecord")
    fun postBill(): String {
        val financial = Entities.Financial(name = "test", DateUtil.date, price = 12.5F, 1, type = Enums.Financial.CASH)
        financialService.insertRecord(financial)
        return "success"
    }

    @GetMapping("financialRecords")
    fun financialRecords(): List<Entities.Financial?>? {
        return financialService.allFinancialRecords()
    }
}