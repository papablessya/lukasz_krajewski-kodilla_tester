package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        System.out.println(bookManager.createBook("Cthulu","Lovecraft"));
        System.out.println(bookManager.createBook("HP","J.K Rowling"));
        System.out.println(bookManager.createBook("LOTR","R.J.J Tolkien"));
        String x = "Cthulu";
        String y = "Lotr";
        System.out.println( x == y);
        System.out.println(x.equals(y));
    }
}
