package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    final int id;
    final String username;
    final char gender;
    final LocalDate birthday;
    final int posts;

    public ForumUser(final int id, final String username, final char gender, final LocalDate birthday, final int posts) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.birthday = birthday;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", posts=" + posts +
                '}';
    }
}
