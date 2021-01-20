package com.kodilla.exception;

import java.util.Scanner;

public class UserDialogs {
    /*
    Metoda getNumberOfRounds() zadaje w konsoli pytanie użytkownikowi o liczbę rund
    (na przykład w grze). Do odczytania danych wprowadzanych przez użytkownika używamy
    klasy Scanner, która pozwala na odczytywanie danych wprowadzanych na przykład
    z klawiatury.
    Użytkownik nie jest jednak w żaden sposób przez system ograniczany i może wprowadzić
    tekst, które nie nadaje się do przekształcenia w liczbę (wprowadzi na przykład litery
    zamiast cyfr, albo spacje w środku pomiędzy cyframi). Dlatego też wywołanie metody
    Integer.parseInt() narażone jest na wystąpienie błędu – jeżeli użytkownik wprowadzi
    niepoprawne dane, wówczas metoda ta rzuci wyjątek. Jednak dzięki temu, że umieściliśmy
    wywołanie tej metody w bloku try, możliwe jest przechwycenie tego wyjątku
    (w bloku catch wpisaliśmy klasę Exception, więc przechwyci ona wszystkie wyjątki tej
    klasy lub dowolnej klasy z Exception dziedziczącej).
    W przypadku wystąpienia błędu wyświetlony zostanie stosowny komunikat, a pętla spowoduje,
    że program zapyta użytkownika ponownie o liczbę rund.
    Jeżeli wprowadzona liczba będzie poprawna, wówczas metoda Integer.parseInt(),
    konwertująca typ String na typ int, wykona się poprawnie i wprowadzona liczba
    zostanie zwrócona przez return (jako liczba, a nie jako tekst).
    Metoda getNumberOfRound() została zdefiniowana jako metoda statyczna, wobec czego
    można ją wywołać wprost "na klasie" UserDialogs.
     */

    public static int getNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of rounds:");
            String s = scanner.nextLine();
            try {
                int rounds = Integer.parseInt(s);
                return rounds;
            } catch (Exception e) {
                System.out.println("Wrong data. Enter only digits. try again.");
            }
        }
    }
}
