package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulatorTestSuite {

    private StringManipulator manipulator = new StringManipulator();


    // Tworzymy statyczną metodę, której celem będzie przygotowanie danych testowych.
    private static Stream<Arguments> provideStringsForTestingLength() {
        return Stream.of(
                Arguments.of("test", 4),
                Arguments.of("OtHEr ", 5),
                Arguments.of("E V e n t", 5),
                Arguments.of("null ", 4),
                Arguments.of("A", 1)
        );
    }

    @ParameterizedTest
    @CsvSource(value = {"test,tset", "OtHEr,rehto", "EVent,tneve", "null,llun", "A,a"})
    public void shouldReverseStringWithLowerCase_(String input, String expected) {
        assertEquals(expected, manipulator.reverseWithLowerCase(input));
    }

    // Zmienna numLinesToSkip określa, ile wierszy liczonych od góry powinno być
    // pominiętych przy odczytywaniu wartości. Zazwyczaj stosujemy wartość 1 –
    // w pliku CSV często tworzy się tzw. header (pol. nagłówek – pierwszy wiersz z
    // wymienionymi nazwami "kolumn").
    @ParameterizedTest
    @CsvFileSource(resources = "/stringWithLowerCase.csv", numLinesToSkip = 1)
    public void shouldReverseStringWithLowerCase(String input, String expected) {
        assertEquals(expected, manipulator.reverseWithLowerCase(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"test,4", " OtHEr ,5", "E V e n t,5", "null ,4", "A,1"})
    public void shouldCalculateStringLengthWithoutSpaces__(String input, int expected) {
        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }

    //'value' powinno wskazywać na nazwę metody tworzącej dane testowe.
    // Wartość 'value' z @MethodSource możemy pominąć, ale konieczne wtedy jest
    // nazwanie metody produkującej dane tak samo, jak metody testującej.
    @ParameterizedTest
    @MethodSource(value = "provideStringsForTestingLength")
    public void shouldCalculateStringLengthWithoutSpaces_(String input, int expected) {
        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }


    // test z użyciem metody zawartej w zewnętrznej klasie ('StringSources').
    // Musimy tutaj wykorzystać adnotację @MethodSource z taką różnicą, że zamiast samej nazwy metody
    // podajemy zapis: nazwaKlasy#nazwaMetody
    // Całego pakietu, w którym znajduje się klasa, nie warto przepisywać ręcznie.
    // Ryzyko popełnienia literówki jest dość duże. Możemy oczywiście skorzystać ze wsparcia IntelliJ.
    // W klasie 'StringSource' klikamy w nazwę metody prawym przyciskiem myszy i wybieramy
    // "Copy Reference". Wtedy wystarczy tylko kropkę przed nazwą metody zamienić na znak # i gotowe!
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.StringSources#provideStringsForTestingLength")
    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }


    @ParameterizedTest
    @CsvSource(value = {"te,st:1", "..OtHEr :0", "E,V,e,n.t:3", "null :0", "A:0"}, delimiter = ':')  //Delimiter musi być typu char: jest to pojedynczy znak, który będzie używany do separowania wartości wejściowej od wartości oczekiwanej.
    public void shouldCountNumberOfCommas_(String input, int expected) {
        assertEquals(expected, manipulator.countNumberOfCommas(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/stringWithCommas.csv", numLinesToSkip = 1, delimiter = ':')  //Delimiter musi być typu char: jest to pojedynczy znak, który będzie używany do separowania wartości wejściowej od wartości oczekiwanej.
    public void shouldCountNumberOfCommas(String text, int expected) {
        assertEquals(expected, manipulator.countNumberOfCommas(text));
    }
}