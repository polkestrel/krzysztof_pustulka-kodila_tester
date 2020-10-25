package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {             //testowanie wyniku dodawania
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {        //testowanie wyniku odejmowania
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquarePower() {     //testowanie potęgowania kwadratowego liczby > 0
        Calculator calculator = new Calculator();
        int c = 9;
        int squarePowerResult = calculator.squarePower(c);
        assertEquals(81, squarePowerResult);
    }

    @Test
    public void testSquarePowerZero() {     //testowanie potęgowania kwadratowego liczby 0
        Calculator calculator = new Calculator();
        int c = 0;
        int squarePowerResult = calculator.squarePower(c);
        assertEquals(0, squarePowerResult);
    }

    @Test
    public void testSquarePowerLessZero() {     //testowanie potęgowania kwadratowego liczby < 0
        Calculator calculator = new Calculator();
        int c = -3;
        int squarePowerResult = calculator.squarePower(c);
        assertEquals(9, squarePowerResult);
    }
}
