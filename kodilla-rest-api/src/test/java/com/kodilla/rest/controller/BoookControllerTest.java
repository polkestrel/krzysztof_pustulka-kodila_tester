package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import static org.assertj.core.api.Assertions.assertThat;

class BoookControllerTest {

    @Test
    public void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BoookController bookController = new BoookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1","Author 1"));
        booksList.add(new BookDto("Title 2","Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);
        //when
        List<BookDto> result = bookController.getBooks(booksList);
        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BoookController bookController = new BoookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1","Author 1"));
        booksList.add(new BookDto("Title 2","Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);
        //when
        bookController.addBook(new BookDto("Title 1","Author 1"));
        bookController.addBook(new BookDto("Title 2","Author 2"));
        System.out.println(bookController.getBooks(booksList));
        //then
        Mockito.verify(bookServiceMock).addBook(new BookDto("Title 1", "Author 1"));
        Mockito.verify(bookServiceMock).addBook(new BookDto("Title 2", "Author 2"));
    }
}