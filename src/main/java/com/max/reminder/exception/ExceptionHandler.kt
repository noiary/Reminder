package com.max.reminder.exception

import com.max.reminder.pojo.request.R
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ExceptionHandler {
    @ExceptionHandler(Exceptions.BusinessException::class)
    fun handleBusinessException(exception: Exceptions.BusinessException): R {
        return R(exception.errorCode, exception.message)
    }

    @ExceptionHandler(Exception::class)
    fun handlerException(e: Exception): R {
        return R(ExceptionEnum.UNEXPECTED_EXCEPTION.exception("Unexpected error on server", e.message))
    }
}