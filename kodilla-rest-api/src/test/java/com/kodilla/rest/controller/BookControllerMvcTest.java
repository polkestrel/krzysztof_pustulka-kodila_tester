//package com.kodilla.rest.controller;
//
//import com.kodilla.rest.domain.BookDto;
//import com.kodilla.rest.service.BookService;
//import org.hamcrest.Matchers;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import java.util.ArrayList;
//import java.util.List;
//import static org.springframework.http.MediaType.APPLICATION_JSON;
//
//// adnotacja @WebMvcTest - jako parametr przyjmuje
//// deskryptor klasy zawierającej testowany kontroler.
//// Deskryptor klasy to taki specjalny obiekt opisujący klasę
//// (tzw. metadane klasy). Dostęp do niego uzyskuje się poprzez
//// pole .class klasy, które tworzy się automatycznie.
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(BoookController.class)
//public class BookControllerMvcTest {
//
//
//    // pole klasy typu MockMvc, którego zawartość ma zostać
//    // wstrzyknięta przez Springa (mówi o tym adnotacja @Autowired).
//    // Tu właśnie pojawi się obiekt kontrolera, który będziemy
//    // poddawali testom.
//    @Autowired
//    private MockMvc mockMvc;
//
//
//    // tworzymy mocka klasy BookService
//    // (z którego będzie korzystał nasz kontroler).
//    // Mock ten będzie beanem (mówi o tym adnotacja @MockBean).
//    @MockBean
//    private BookService bookService;
//
//    @Test
//    public void shouldFetchBooks() throws Exception {
//        //given
//        // poniższa konfiguracja spowoduje, że po wywołaniu metody
//        // getBooks() naszego mocka, zwrócona zostanie lista
//        // zawierająca dwie książki.
//        List<BookDto> booksList = new ArrayList<>();
//        booksList.add(new BookDto("title 1", "author 1"));
//        booksList.add(new BookDto("title 2", "author 2"));
//        Mockito.when(bookService.getBooks()).thenReturn(booksList);
//
//        // W linii [1] na obiekcie mockMvc wywołujemy metodę perform,
//        // która wywołuje prawdziwy http request na naszym kontrolerze.
//        // Argumentem tej metody jest obiekt specjalnej klasy MockMvcRequestBuilder,
//        // który odpowiedzialny jest za utworzenie odpowiedniego requesta http.
//        // Możemy się posłużyć tutaj metodą statyczną get klasy MockMvcRequestBuilders,
//        // która tworzy taki obiekt będący odpowiednikiem requesta http związanego z metodą GET protokołu http.
//        // Argumentem tej metody jest adres URL, na jaki ma zostać wysłane żądanie
//        // (nie podajemy adresu serwera – tylko adres względny "/books"). Na builderze utworzonym przy pomocy metody get
//        // wywołujemy jeszcze metodę contentType, która ustawia odpowiednio właściwości http requestu –
//        // dokładnie tak samo, jak zrobilibyśmy to w narzędziu Postman.
//        // W linii [2] zaczyna się seria "asercji". W tym przypadku są to metody andExpect
//        // wywoływane na wyniku wywołania metody perform (czyli na tym, co zwrócił kontroler REST API).
//        // Nasz test sprawdza dwie rzeczy: status odpowiedzi (powinien wynosić 200)
//        // oraz rozmiar zwróconej tablicy z książkami (tu: 2).
//        //when & then
//        mockMvc.perform(MockMvcRequestBuilders.get("/books")                       // [1]
//                .contentType(APPLICATION_JSON))
//                .andExpect(MockMvcResultMatchers.status().is(200))                     // [2]
//                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
//    }
//}
//
