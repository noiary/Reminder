package com.max.reminder.dao

import com.max.reminder.common.Enums
import com.max.reminder.pojo.Entities
import org.springframework.data.repository.CrudRepository

class Repositories {
    interface Sign : CrudRepository<Entities.Sign, Long> {
        fun findByUserIdAndType(userId: Int, type: Enums.Sign): List<Entities.Sign>
    }

    interface Financial : CrudRepository<Entities.Financial, Long>
}