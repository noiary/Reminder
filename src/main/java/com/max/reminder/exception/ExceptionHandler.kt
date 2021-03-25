package com.max.reminder.exception

import com.max.reminder.pojo.R
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody

@ControllerAdvice
class ExceptionHandler {
    @ExceptionHandler(Exceptions.BusinessException::class)
    @ResponseBody
    fun handleBusinessException(exception: Exceptions.BusinessException): ResponseEntity<R> {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
            R(
                exception.errorCode,
                exception.message
            )
        )
    }

    @ExceptionHandler(Exception::class)
    @ResponseBody
    fun handlerException(e: Exception): ResponseEntity<R> {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body(
                R(
                    ExceptionEnum.UNEXPECTED_EXCEPTION.exception(
                        "Unexpected error on server",
                        e.message
                    )
                )
            )
    }
}