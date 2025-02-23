package com.kodilla.testing.learning;

public class ForumUser extends User {
    private String userName;
    private int numberOfPosts;
    private boolean isLogged;

    public ForumUser(String userName,int numberOfPosts, boolean isLogged,
                     String name, String surname, String sex, int age, String email) {
        super(name, surname, sex, age, email);
        this.userName = userName;
        this.numberOfPosts = numberOfPosts;
        this.isLogged = isLogged;
    }
    public void post() {

    }
    public void commentPost() {

    }

    public String getUserName() {
        return userName;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public boolean isLogged() {
        return isLogged;
    }
}
