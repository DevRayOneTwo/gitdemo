package ru.devray.day6;

public class AccountSuspendedException extends RuntimeException{
    public AccountSuspendedException(String message) {
        super(message);
        System.err.println("Account is suspended!");
    }
}
