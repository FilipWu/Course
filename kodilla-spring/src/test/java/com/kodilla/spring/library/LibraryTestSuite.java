package com.kodilla.spring.library;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class LibraryTestSuite {
    @Test
    void testLoadFromDb() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);
        //when
        library.loadFromDb();
    }
    @Test
    void testSaveFromDb() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);
        //when
        library.saveToDb();
    }
}
