package ru.devray.day6;

public class User {
    String login;
    String password;
    boolean isSuspended;

    public User(String login, String password, boolean isSuspended) {
        this.login = login;
        this.password = password;
        this.isSuspended = isSuspended;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", isSuspended=" + isSuspended +
                '}';
    }
}
