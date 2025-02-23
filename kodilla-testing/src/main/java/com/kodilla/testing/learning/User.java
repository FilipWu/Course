package com.kodilla.testing.learning;

public class User {
    private String name;
    private String surname;
    private String sex;
    private int age;
    private String email;

    public User (String name,String surname,String sex, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.email = email;
    }
    public void logIn() {

    }
    public void deleteAccount() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
