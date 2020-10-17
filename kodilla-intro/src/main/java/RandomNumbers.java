import java.awt.desktop.SystemEventListener;
import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        Random liczba = new Random();   // stworzenie obiektu klasy random

        int iteracja;
        int result = 0;
        int min = 30;
        int max = 0;
        System.out.println("Zaczynamy losowanie pierwszej liczby...");
        for (iteracja = 1; result < 5000; iteracja++) {
            int wylosowanaLiczba = liczba.nextInt(31);     // losowanie pseudoloswej liczby całkowitej z przedziału liczb [0-30]
            result += wylosowanaLiczba;                            // tak długo, aż ich suma przekroczy 5000
            System.out.println("Losowanie numer: " + iteracja + ". Po wylosowaniu liczby: " + wylosowanaLiczba + ", teraz nasza suma wynosi: " + result);

            if (wylosowanaLiczba > max) {               // pętla do zdefiniowania największej wylosowanej liczby
                max = wylosowanaLiczba;
            }

            if (wylosowanaLiczba < min) {               //pętla do zdefiniowania najmniejszej wylosowanej liczby
                min =   wylosowanaLiczba;
            }
        }
        System.out.println("Nasza suma wynosi teraz więcej niż 5000, a więc czas przerwać działanie programu.");
        System.out.println("Największa wylosowana liczba to: " + max);
        System.out.println("Najmniejsza wylosowana liczba to: " + min);
    }
}
