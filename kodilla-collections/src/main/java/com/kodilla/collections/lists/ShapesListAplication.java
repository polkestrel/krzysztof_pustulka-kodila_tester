package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListAplication {
    public static void main(String[] args) {

        // definicja typu zmiennej 'List' (jest to również nazwa interfejsu)
        // przechowującej kolekcję 'Square'. Nazwa zmiennej to 'shapes' i przypisujemy tej zmiennej
        // nowy obiekt klasy 'ArrayList'.
        // Jednym słowem w poniższej linijce kodu utworzyliśmy zmienną 'shapes'
        // typu List<Square>, a także przypisaliśmy do niej nową, pustą kolekcję
        // w postaci obiektu klasy 'ArrayList'.
        List<Square> shapes = new ArrayList<>();

        //tworzymy kilka obiektów klasy 'Square' i dodajemy je do kolekcji 'shapes'
        shapes.add(new Square(10.0));
        shapes.add(new Square(5.0));
        shapes.add(new Square(1.0));

        // wyświetlamy przy pomocy pętli for wszystkie obiekty zapisane w kolekcji 'shapes'
        // których pole powierzgni jest większe od 20
        /*
        for (int n = 0; n < shapes.size(); n++) {
            Square square = shapes.get(n);
            if (square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());
        }
         */

        // to samo co wyżej, można uzyskać za pomoca pętli for-each przestawionej tutaj.
        // W lini nr 36 uruchamiana jest pętla for-each na kolekcji 'shapes' -
        // - w kolejnych iteracjach kolejne elementy z tej kolekcji będą umieszczane
        // w zmiennej 'square', która jest typu 'Square'
        // (pętlę for-each najwygodniej czyta się od prawej strony do lewej).
        for (Square square : shapes) {
            if (square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());
        }
    }
}
