package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        bookManager.createBook("Solaris","Stanisław Lem");
        bookManager.createBook("Dune","Frank Herbert");
        bookManager.createBook("Dune","Frank Herbert");
        bookManager.createBook("Po piśmie","Jacek Dukaj");
        System.out.println("-----------------");
        System.out.println("Database consits: " + bookManager.getBooks().size() + " books.");
        //System.out.println(bookManager.getBooks().get(0).getAuthor());
        //System.out.println(bookManager.getBooks().get(1).getAuthor());
        //System.out.println(bookManager.getBooks().get(2).getAuthor());
        }
    }
