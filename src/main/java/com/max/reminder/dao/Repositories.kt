package com.max.reminder.dao

import com.max.reminder.common.Enums
import com.max.reminder.pojo.Entities
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

class Repositories {
    @Repository
    interface Sign : CrudRepository<Entities.Sign, Long> {
        fun findByUserIdAndType(userId: Int, type: Enums.Sign): List<Entities.Sign>
    }

    @Repository
    interface Financial : CrudRepository<Entities.Financial, Long>
}