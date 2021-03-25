package com.max.reminder.service.impl

import com.max.reminder.dao.Repositories
import com.max.reminder.pojo.Entities
import com.max.reminder.service.FinancialService
import org.springframework.stereotype.Service

@Service
class FinancialServiceImpl(private val financialRepository: Repositories.Financial) : FinancialService {

    override fun insertRecord(entity: Entities.Financial) {
        financialRepository.save(entity)
    }


    override fun allFinancialRecords(): List<Entities.Financial> {
        return financialRepository.findAll().toList()
    }

}