package com.example.fakeairbnb.api.exception;

import com.example.fakeairbnb.api.Form.EnderecoForm;
import com.example.fakeairbnb.domain.model.exception.EnderecoNotFound;
import com.example.fakeairbnb.domain.model.exception.LugarNotFound;
import com.example.fakeairbnb.domain.model.exception.ReservaNotFound;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ApiExceptionDetail handlerException(Exception e) {
        log.error("deu exception aqui");
        return new ApiExceptionDetail(HttpStatus.INTERNAL_SERVER_ERROR, "Deu erro geral de aplicacao ");
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ApiExceptionDetail handleValidationException(MethodArgumentNotValidException e) {
        log.error("deu exception aqui");
        return new ApiExceptionDetail(HttpStatus.BAD_REQUEST, "Campos enviados invalidos");
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(LugarNotFound.class)
    @ResponseBody
    public ApiExceptionDetail handlerLugarNotFoundException(LugarNotFound e) {
        log.warn("pediu algo que nao existe");
        return new ApiExceptionDetail(HttpStatus.NOT_FOUND, e.getMessage());
    }
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(EnderecoNotFound.class)
    @ResponseBody
    public ApiExceptionDetail handlerLugarNotFoundException(EnderecoNotFound e) {
        log.warn("pediu algo que nao existe");
        return new ApiExceptionDetail(HttpStatus.NOT_FOUND, e.getMessage());
    }
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ReservaNotFound.class)
    @ResponseBody
    public ApiExceptionDetail handlerLugarNotFoundException(ReservaNotFound e) {
        log.warn("pediu algo que nao existe");
        return new ApiExceptionDetail(HttpStatus.NOT_FOUND, e.getMessage());
    }

}
