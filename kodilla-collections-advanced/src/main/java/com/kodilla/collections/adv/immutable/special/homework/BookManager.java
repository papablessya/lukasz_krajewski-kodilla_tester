package com.kodilla.collections.adv.immutable.special.homework;

import java.util.*;

public class BookManager {
    List<Book> books = new ArrayList<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        for (Book b :
                books) {
            if (b.equals(book)) {
                return b;
            }
        }
        books.add(book);
        return book;
    }


}


