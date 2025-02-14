package edu.sparta.project.oms.product.application.exception;

import lombok.Getter;

@Getter
public class ProductException extends RuntimeException {
    private final int statusCode;

    private ProductException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public static class NotFound extends ProductException {
        public NotFound() {
            super("Cannot find a proper product!", 404);
        }
    }

    public static class NotCreated extends ProductException {

        private NotCreated(String message, int statusCode) {
            super("Product creation failed!", 500);
        }
    }
}
