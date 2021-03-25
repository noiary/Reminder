package com.max.reminder.service.impl

import com.max.reminder.common.Enums
import com.max.reminder.dao.Repositories
import com.max.reminder.pojo.Entities
import com.max.reminder.service.SignService
import com.max.reminder.util.DateUtil
import org.springframework.beans.factory.annotation.Autowired

class SignServiceImpl : SignService {
    @Autowired
    private lateinit var signRepo: Repositories.Sign
    override fun signWeight(weight: Float) {

        val signModel = Entities.Sign(
            userId = 1, // Fixme
            type = Enums.Sign.WEIGHT,
            value = weight.toString(),
            createTime = DateUtil.date
        )
    }
}