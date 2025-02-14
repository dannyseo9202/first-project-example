package edu.sparta.project.oms.product.presentation;

import edu.sparta.project.oms.product.application.exception.ProductException;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProductExceptionHandler {
    @ExceptionHandler(ProductException.NotFound.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorMessage resourceNotFoundException(ProductException.NotFound ex) {
        return ErrorMessage.of(ex.getMessage(), ex.getStatusCode());
    }

    @Value(staticConstructor = "of")
    public static class ErrorMessage {
        String message;
        Integer statusCode;
    }
}
