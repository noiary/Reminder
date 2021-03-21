package com.max.reminder.pojo.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.max.reminder.exception.Exceptions;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class R {
    private String errorCode;
    private String message;
    /**
     * Message for debug
     */
    private String messageD;

    public R(String errorCode, String message) {
        this(errorCode, message, null);
    }

    public R(@NotNull Exceptions.BusinessException e) {
        this(e.getErrorCode(), e.getMessage(), e.getMessageD());
    }
    public R(String errorCode, String message, String messageD) {
        this.errorCode = errorCode;
        this.message = message;
        this.messageD = messageD;
    }
}
