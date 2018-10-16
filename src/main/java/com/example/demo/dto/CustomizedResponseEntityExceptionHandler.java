package com.example.demo.dto;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.Map;

/**
 * Created by kalhara@boswin on 10/16/2018 10:50 AM.
 */
@ControllerAdvice
@RestControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        System.out.println("CustomizedResponseEntityExceptionHandler.handleMethodArgumentNotValid");
        List<ObjectError> allErrors = ex.getBindingResult().getAllErrors();

        System.out.println("allErrors >" + allErrors);
        System.out.println("allErrors.size >" + allErrors.size());
        System.out.println("getModel >" + ex.getBindingResult().getModel());

        Map<String, Object> model = ex.getBindingResult().getModel();

        System.out.println("model.toString > " + model.toString());

        for (ObjectError error : allErrors) {
            System.out.println("error >" + error.getDefaultMessage());
        }


//        return super.handleMethodArgumentNotValid(ex, headers, status, request);
        return new ResponseEntity<Object>(allErrors, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
