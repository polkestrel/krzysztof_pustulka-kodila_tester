package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    private List<Book> books = new ArrayList<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        for (Book book1 : books) {
            if (book1.equals(book)) {
                System.out.println("The following book: " + "\nTitle: " + book1.getTitle() + "; " + "Author: " + book1.getAuthor() +"\nalready exists in the database." +
                        "\nTherefore it won't be added again to the database.");
                return book1;
            }
        }
        books.add(book);
        return book;
    }

    public List<Book> getBooks() {
        return books;
    }
}
