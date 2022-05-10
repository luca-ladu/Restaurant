package it.luca.project.restaurant.exception;

public class UnauthorizedException extends  Exception{

    public UnauthorizedException(String message) {
        super(message);
    }

    public UnauthorizedException(String message, Throwable cause) {
        super(message, cause);
    }
}
