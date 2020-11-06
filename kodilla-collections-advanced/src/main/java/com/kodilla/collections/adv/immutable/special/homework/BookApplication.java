package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        new BookManager().createBook("Solaris","Stanisław Lem");
        new BookManager().createBook("Dune","Frank Herbert");
        new BookManager().createBook("Po piśmie","Jacek Dukaj");
        System.out.println("Solaris" == "Dune");
        System.out.println("Solaris".equals("Dune"));
        System.out.println("----------------");
        System.out.println("Po piśmie" == "Dune");
        System.out.println("Po piśmie".equals("Dune"));
        System.out.println("----------------");
        System.out.println("Stanisław Lem" == "Frank Herbert");
        System.out.println("Stanisław Lem".equals("Frank Herbert"));
        System.out.println("----------------");
        System.out.println("Frank Herbert" == "Jacek Dukaj");
        System.out.println("Frank Herbert".equals("Jacek Dukaj"));
        System.out.println("----------------");
        System.out.println("Frank Herbert" == "Frank Herbert");
        System.out.println("Frank Herbert".equals("Frank Herbert"));
        System.out.println("----------------");
        }
    }
