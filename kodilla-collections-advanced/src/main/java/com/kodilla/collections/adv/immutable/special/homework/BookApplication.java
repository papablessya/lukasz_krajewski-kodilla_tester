package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book book1 =  bookManager.createBook("Cthulu","Lovecraft");
        Book book2 =  bookManager.createBook("HP","J.K Rowling");
        Book book3 =  bookManager.createBook("HP","J.K Rowling");
        System.out.println(System.identityHashCode(book1));
        System.out.println(System.identityHashCode(book2));
        System.out.println(System.identityHashCode(book3));
        System.out.println(book2 == book3);
        System.out.println(book2.equals(book3));
    }
}
