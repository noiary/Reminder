package com.max.reminder.service

import com.max.reminder.pojo.Entities

interface FinancialService {
    fun insertRecord(entity: Entities.Financial)
    fun allFinancialRecords(): List<Entities.Financial?>?
}