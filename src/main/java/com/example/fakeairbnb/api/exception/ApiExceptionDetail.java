package com.example.fakeairbnb.api.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Getter
@JsonInclude(JsonInclude.Include.CUSTOM)
public class ApiExceptionDetail {

    private final String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    private final int status;
    private final String error;
    private final String message;
    private final List<String> details;

    public ApiExceptionDetail(HttpStatus status, String message, List<String> details){
        this.status = status.value();
        this.error = status.getReasonPhrase();
        this.message= message;
        this.details = details;
    }
    public ApiExceptionDetail(HttpStatus status, String message){        this(status, message, null);    }
    public ApiExceptionDetail(HttpStatus status, Exception exception){        this(status, exception.getMessage(), null);}

}
