package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumusers = new ArrayList<>();

    public Forum() {
        forumusers.add(new ForumUser(1, "JohnDoe", 'M', LocalDate.of(1995, 5, 20), 10));
        forumusers.add(new ForumUser(2, "JaneDoe", 'F', LocalDate.of(2000, 7, 15), 5));
        forumusers.add(new ForumUser(3, "MikeSmith", 'M', LocalDate.of(1985, 3, 10), 0));
        forumusers.add(new ForumUser(4, "AnnaJohnson", 'F', LocalDate.of(1998, 10, 30), 20));
        forumusers.add(new ForumUser(5, "ChrisBrown", 'M', LocalDate.of(2004, 1, 5), 3));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(forumusers);
    }

}
