package com.kodilla.optional;

import com.kodilla.stream.User;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1",30,100,"Test");
        //User user = null;

        Optional<User> optionalUser = Optional.ofNullable(user);
        // Wywołujemy metodę orElse na obiekcie optionalUser.
        // Metoda ta, gdy optionalUser zawiera w środku null, zwróci to,
        // co przekazano jej jako argument, czyli w naszym przypadku będzie to
        // "pusty" obiekt klasy User. Dzięki temu wywołanie metody getUsername() nie zakończy się
        // wyjątkiem NullPointerException.
        //String username = optionalUser.orElse(new User("",0,0,"")).getUsername();

        // Metoda ifPresent jako argument przyjmuje wyrażenie lambda, które zostanie wykonane wówczas,
        // gdy opakowany obiekt nie ma wartości null, w przeciwnym wypadku żadna akcja nie zostanie wykonana.
        optionalUser.ifPresent(u -> System.out.println(u.getUsername()));

        //System.out.println(username);
    }
}
