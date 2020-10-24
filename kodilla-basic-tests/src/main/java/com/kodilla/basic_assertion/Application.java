package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int c = 9;
        int sumResult = calculator.sum(a, b);
        int subtractResult = calculator.subtract(a, b);
        int squarePowerResult = calculator.squarePower(c);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        boolean correctSubtract = ResultChecker.assertEquals(-3, subtractResult);
        boolean correctSquarePower = ResultChecker.assertEquals(81, squarePowerResult);
        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        if (correctSubtract) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }
        if (correctSquarePower) {
            System.out.println("Metoda squarePower działa poprawnie dla liczby " + c);
        } else {
            System.out.println("Metoda squarePower nie działa poprawnie dla liczby " + c);
        }
    }
}
