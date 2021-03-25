package com.max.reminder.pojo

import com.fasterxml.jackson.annotation.JsonInclude
import com.max.reminder.exception.Exceptions.BusinessException

@JsonInclude(JsonInclude.Include.NON_NULL)
class R constructor(
    private val errorCode: String, private val message: String?,
    /**
     * Message for debug
     */
    private val messageD: String? = null
) {
    constructor(e: BusinessException) : this(e.errorCode, e.message, e.messageD) {}
}