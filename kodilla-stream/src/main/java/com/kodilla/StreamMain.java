package com.kodilla;



import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forum.ForumUser;


import java.time.LocalDate;
import java.util.List;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
/*        People.getList().stream()
                .map(i ->i.toUpperCase())
                .forEach(System.out::println);

        System.out.println();

        People.getList().stream()
                .map(i -> i.toUpperCase())
                .filter(n ->n.length() > 11)
                .map(s -> s.substring(0, s.indexOf(" ") + 2) + ".")
                .filter(s -> s.substring(0,1).equals("M"))
                .forEach(System.out::println);*/

       // BookDirectory bookDirectory = new BookDirectory();

     /*   bookDirectory.getList().stream()
                .filter(n ->n.getYearOfPublication() > 2005)
                .forEach(System.out::println);
*/
        //lista

       /* List<Book> theResultListOfBooks = bookDirectory.getList().stream()
                .filter(n ->n.getYearOfPublication() > 2005)
                .collect(Collectors.toList());
        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);
*/
        //mapa
      /*  Map<String,Book> theResultMapOfBooks = bookDirectory.getList().stream()
                .filter(n ->n.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/















    }
}