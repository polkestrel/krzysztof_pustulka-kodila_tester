package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.Objects;

public class BookManager{

    private String title;
    private String author;
    private ArrayList<Book> books = new ArrayList<>();


    public Book createBook(String title,String author) {
        this.title = title;
        this.author = author;
        //return new Book (title, author);
        Book book = new Book(title, author);
        if (!(book.equals(book))) {
            books.add(book);
        }
        return book;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookManager that = (BookManager) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(author, that.author) &&
                Objects.equals(books, that.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, books);
    }

    @Override
    public String toString() {
        return "BookManager{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", books=" + books +
                '}';
    }
}
