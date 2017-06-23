package com.sapient.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = { IllegalArgumentException.class, IllegalStateException.class })
    protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {
        String bodyOfResponse = "This should be application specific";
        return handleExceptionInternal(ex, bodyOfResponse, 
          new HttpHeaders(), HttpStatus.CONFLICT, request);
    }
    
    /**
     * Handle exceptions thrown by handlers.
     */
   /* @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ApiError exception(Exception exception, WebRequest request) {
        return new ApiError(Throwables.getRootCause(exception).getMessage());
    }*/
    
   /* @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    ErrorMessage handleException(Exception ex) {
        ErrorMessage errorMessage = createErrorMessage(ex);
        return errorMessage;
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.GONE)
    @ResponseBody
    ErrorMessage handleException(OtherException ex) {
        ErrorMessage errorMessage = createErrorMessage(ex);
        return errorMessage;
    }*/   
    
}   



