package ru.devray.day6;

public class InvalidPasswordException extends RuntimeException{
    public InvalidPasswordException(String message) {

        super(message);
        System.err.println("We have a bad password!!!");
    }

    public InvalidPasswordException() {

    }
}
