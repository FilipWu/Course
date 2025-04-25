package com.kodilla.library;


import com.kodilla.patterns.library.Book;
import com.kodilla.patterns.library.Library;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks() throws CloneNotSupportedException {
        // Given
        Library library = new Library("Main Library");

        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", LocalDate.of(1937, 9, 21));
        Book book2 = new Book("1984", "George Orwell", LocalDate.of(1949, 6, 8));
        Book book3 = new Book("Dune", "Frank Herbert", LocalDate.of(1965, 8, 1));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library shallowLibrary = library.shallowCopy();
        Library deepLibrary = shallowLibrary.deepCopy();

        library.getBooks().remove(book1);

        System.out.println("Normal library -" + library.getBooks().size());
        System.out.println("shallow library -" + shallowLibrary.getBooks().size());
        System.out.println("deep library -" + deepLibrary.getBooks().size());

        assertNotEquals(library.getBooks().size(), deepLibrary.getBooks().size());
        assertEquals(2,library.getBooks().size());
        assertEquals(2, shallowLibrary.getBooks().size());
        assertEquals(3,deepLibrary.getBooks().size());


    }
}