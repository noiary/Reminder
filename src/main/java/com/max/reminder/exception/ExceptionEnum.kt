package com.max.reminder.exception

enum class ExceptionEnum(val errorCode: String) : ExceptionGenerator {
    UNEXPECTED_EXCEPTION("1000"),
    LOGIN_USERNAME_OR_PASSWORD_INVALID("L1001")
    ;

    override fun exception(message: String?, vararg args: Any?): Exceptions.BusinessException {
        return Exceptions.BusinessException(enum = this, message = message, args = args)
    }
}