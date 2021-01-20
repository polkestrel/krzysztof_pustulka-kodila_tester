package com.kodilla.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradesTestSuite {

    /*
    Pierwszy test sprawdza, czy w nowym obiekcie Grades tablica z ocenami
    jest pusta.
     */

    @Test
    public void shouldHaveZeroLength() {
        Grades grades = new Grades();
        int[] values = grades.getValues();
        assertEquals(0, values.length);
    }

    /*
    Drugi test sprawdza, czy po dodaniu dwóch ocen tablica ma odpowiedni
    rozmiar oraz czy znajdują się w niej dodane wartości.
     */

    @Test
    public void shouldAddTwoElementsToArray() {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);

        int[] values = grades.getValues();
        assertEquals(2, values.length);
        assertEquals(4, values[0]);
        assertEquals(2, values[1]);
    }

    @Test
    public void shouldCalculateAverage() {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);
        grades.add(5);

        assertEquals(3.66, grades.getAverage(), 0.01);  //delta – dopuszczalna różnicy między wartością oczekiwaną, a otrzymaną
    }

    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        Grades grades = new Grades();
        assertEquals(0, grades.getAverage(), 0.0001);
    }
}
