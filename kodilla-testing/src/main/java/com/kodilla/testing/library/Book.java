package com.kodilla.testing.library;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.Objects;

@Value
@AllArgsConstructor
public class Book {
    private String title;
    private String author;
    private int publicationYear;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}
