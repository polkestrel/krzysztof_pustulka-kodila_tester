package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        /*
        Wywołujemy metodę, która zwraca nam ArrayList obiektów typu User.
        Następnie uruchamiamy strumień (IntelliJ podpowiada po prawej stronie,
        że wynikiem działania tej linii jest Stream, przez który przepływają obiekty typu User).
        Następnie mamy pierwsza operację transformująca. Metoda map klasy Stream pozwala nam
        modyfikować obiekty przepływające przez strumień.
        Argumentem tej metody jest tzw. wyrażenie lambda. Po lewej stronie strzałki znajdują się zmienne
        reprezentujące argumenty wejściowe funkcji (tu mamy zmienną u – nazwa jest tak naprawdę dowolna –
        do której będą wpadały kolejne obiekty klasy User), po prawej stronie natomiast znajduje się kod
        zwracający obiekty wynikowe (tu mamy wywołanie gettera getUsername().
        Widać więc, że wynikiem działania tej funkcji będą obiekty typu String zawierające nazwę użytkownika).
        IntelliJ ponownie nam podpowiada, że wynikiem tej linii będzie strumień Stream obiektów typu String.
        Ostatnia linia to wyrażenie terminalne (kolektor). Metoda forEach klasy Stream jest kolektorem,
        który wykonuje daną operację na każdym obiekcie, przepływającym kolejno przez strumień.
        Kolektor "konsumuje" obiekty ze strumienia, nie przekazując ich już dalej, i kończy Stream.
        Operacja, która ma być wykonana na obiektach ze strumienia, ponownie podawana jest jako wyrażenie lambda, czyli funkcja.
        Na wejściu (z lewej strony strzałki) otrzymuje ona String z nazwą użytkownika (użyliśmy tu zmiennej o nazwie un),
        a w swym wnętrzu wywołuje System.out.println na tej zmiennej (z prawej strony strzałki), co powoduje wyświetlenie obiektów na ekranie.
        */
        List<String> usernames = UsersRepository.getUsersList()
                /*
                .stream()
                .map(u -> u.getUsername())
                .forEach(un -> System.out.println(un));
                 */

                /*
                .stream()
                //Zamiast wyrażenia lambda, użyliśmy teraz referencji do metody getUsername().
                .map(UsersManager::getUserName)
                .forEach(un -> System.out.println(un));
                 */

                .stream()
                //Pojawia się w nowa metoda klasy Stream – metoda filter.
                // Jako argument przekazujemy do tej metody wyrażenie lambda,
                // które zwraca true lub false (informację, czy dany obiekt ma zostać przepuszczony dalej w strumieniu, czy też nie).
                // W naszym przykładzie przepuszczamy dalej w strumieniu jedynie te obiekty klasy User,
                // dla których spełniony jest warunek getGroup().equals("Chemists").
                .filter(u -> u.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());  // Kolektor Collectors.toList() utworzy z elementów przepływających przez strumień listę, którą przypisujemy do zmiennej usernames
                //.forEach(un -> System.out.println(un));
        System.out.println(usernames);
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
