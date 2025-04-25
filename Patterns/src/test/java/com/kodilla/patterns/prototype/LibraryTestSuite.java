package com.kodilla.patterns.prototype;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        Library library = new Library("Main library");
        Book book1 = new Book("Book 1", "Author 1", LocalDate.of(1990, 1, 1));
        Book book2 = new Book("Book 2", "Author 2", LocalDate.of(1990, 1, 2));
        Book book3 = new Book("Book 3", "Author 3", LocalDate.of(1990, 1, 3));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library shallowLibrary = null;

        try {
            shallowLibrary = library.shallowCopy();
        }catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepLibrary = null;
        try {
            deepLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(book1);

        System.out.println("Main library " +library.getBooks().size());
        System.out.println("Shallow library " +shallowLibrary.getBooks().size());
        System.out.println("Deep library " +deepLibrary.getBooks().size());

        assertEquals(2,library.getBooks().size());
        assertEquals(library.getBooks().size(),shallowLibrary.getBooks().size());
        assertNotEquals(library.getBooks().size(),deepLibrary.getBooks().size());
        assertEquals(3,deepLibrary.getBooks().size());


    }
}
