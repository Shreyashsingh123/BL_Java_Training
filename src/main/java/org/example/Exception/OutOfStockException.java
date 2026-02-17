package org.example.Exception;

public class OutOfStockException extends RuntimeException {
    OutOfStockException(){
        super("No Product Avilable");
    }
    public OutOfStockException(String message) {
        super(message);
    }
}