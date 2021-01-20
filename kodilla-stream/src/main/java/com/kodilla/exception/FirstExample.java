package com.kodilla.exception;

public class FirstExample {
    public static void main(String[] args) {
        String username = "Willy Wonka";
        //String username = null;     // Prezentacja błędu 'NullPointerException"
        //String username = "John";       // Prezentacja błędu 'ArrayIndexOutOfBoundsException'
        String[] nameParts = username.split(" ");
        System.out.println("Firstname: " + nameParts[0]);
        System.out.println("Lastname: " + nameParts[1]);
    }
}
