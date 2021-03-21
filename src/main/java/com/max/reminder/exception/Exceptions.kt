package com.max.reminder.exception


class Exceptions {
    class BusinessException(enum: ExceptionEnum, message: String? = null, vararg args: Any?) :
        RuntimeException(message ?: enum.name) {
        var errorCode: String = enum.errorCode
        var messageD: String = args.joinToString { "$it | " }.dropLast(2)
    }
}


interface ExceptionGenerator {
    fun exception(message: String? = null, vararg args: Any?): Exceptions.BusinessException
}