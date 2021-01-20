package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    // @RestController – adnotacja ta mówi o tym, że nasza klasa jest
    // kontrolerem REST API. Oznacza to tyle, że będzie ona odpowiedzialna za
    // obsługę napływających żądań http request oraz za generowanie odpowiedzi http response.

    // @RequestMapping("/books") – adnotacja ta wskazuje, jaki będzie adres URL
    // naszej usługi. Domyślnie aplikacja w Springu uruchamia się na porcie 8080.
    // Ustawienie więc ścieżki "/books" spowoduje, że nasza usługa będzie dostępna
    // pod adresem http://localhost:8080/books.

@RestController
@RequestMapping("/books")
class BoookController {

    private final BookService bookService;

    public BoookController(BookService bookService) {
        this.bookService = bookService;
    }

    // @GetMapping – oznacza ona, że metoda ta ma być odpowiedzialna za
    // obsługę żądań http request wysyłanych do naszej aplikacji
    // przy pomocy metody GET

//    @GetMapping
//    public List<BookDto> getBooks() {
//        return new ArrayList<>();
//    }

    @GetMapping
    public List<BookDto> getBooks(List<BookDto> booksList) {
        return bookService.getBooks();
    }

    // @PostMapping mówi o tym, że metoda addBook będzie odpowiedzialna za obsługę
    // żądań wysyłanych metodą POST protokołu http.
    // @RequestBody oznacza, że obiekt ten będzie przekazywany
    // przez 'body' żądania http request.
    @PostMapping
    public void addBook(@RequestBody BookDto bookDto) {
        bookService.addBook(bookDto);
    }

//    @DeleteMapping()
//    public void delBook(@RequestBody BookDto bookDto) {
//        bookService.removeBook(bookDto);
//    }

    @DeleteMapping(value = "/{index}/")
    public void delBook(@PathVariable int index) {
        bookService.removeBook(index);
    }
}