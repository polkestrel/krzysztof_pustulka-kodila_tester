package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.stream.Collectors;

class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/stringOfNumbersToPassTheTest.csv", numLinesToSkip = 1)
    public void shouldPassWhenTheValueOfNumbersIsBetweenOneToFourtynineAndTheSetContainsSixElements(String numbers) throws InvalidNumbersException {
        String[] arrayOfStringsFromTheFile = numbers.split(" ");                         // Wczytuję liczby z pliku .csv do tablicy 'arrayOfStringsFromTheFile'. Liczby są oddzielone znakiem spacji.
        Set<String> setOfStringsFromTheFile = new HashSet<>(Arrays.asList(arrayOfStringsFromTheFile));    // Tworzę nowy zbiór 'setOfStringsFromTheFile' typu String, do którego wczytuję liczby (nadal typu String) z tablicy 'arrayOfStringsFromTheFile'
        List<Integer> listOfNumbersFromTheFile = setOfStringsFromTheFile                             // Tworzę kolejną listę (już tym razem typu Integer) i za pomocą metody stream przekształcam dane typu String w Integer
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toList());
        Set<Integer> finalSetOfNumbersFromTheFile = new HashSet<>(listOfNumbersFromTheFile);      // Przekształcenie danych 'listOfNumbersFromTheFile' z typu 'List' na 'finalSetOfNumbersFromTheFile' typu 'Set' ponieważ chcemy testować metodę 'howManyWins', która operuje na zmiennych typu 'Set'
        gamblingMachine.howManyWins(finalSetOfNumbersFromTheFile);
        System.out.println("To pass the test we are testing now the following set of numbers: " + finalSetOfNumbersFromTheFile + ".");
        assertDoesNotThrow(InvalidNumbersException::new);
        assertTrue(finalSetOfNumbersFromTheFile.size() <= 6 && finalSetOfNumbersFromTheFile.size() >= 0);
        assertEquals(6,finalSetOfNumbersFromTheFile.size());
        assertNotNull(gamblingMachine.howManyWins(finalSetOfNumbersFromTheFile));
        }

    @ParameterizedTest
    @CsvFileSource(resources = "/stringOfNumbersToFailTheTest.csv", numLinesToSkip = 1)
    public void shouldNotPassCauseTheValueOfNumbersIsOutsideTheRangeOfOneToFourtynineAndTheSetContainsMoreThanSixElements(String numbers) {
        String[] arrayOfStringsFromTheFile = numbers.split(" ");                         // Wczytuję liczby z pliku .csv do tablicy 'arrayOfStringsFromTheFile'. Liczby są oddzielone znakiem spacji.
        Set<String> setOfStringsFromTheFile = new HashSet<>(Arrays.asList(arrayOfStringsFromTheFile));    // Tworzę nowy zbiór 'setOfStringsFromTheFile' typu String, do którego wczytuję liczby (nadal typu String) z tablicy 'arrayOfStringsFromTheFile'
        List<Integer> listOfNumbersFromTheFile = setOfStringsFromTheFile                             // Tworzę kolejną listę (już tym razem typu Integer) i za pomocą metody stream przekształcam dane typu String w Integer
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toList());
        Set<Integer> finalSetOfNumbersFromTheFile = new HashSet<>(listOfNumbersFromTheFile);      // Przekształcenie danych 'listOfNumbersFromTheFile' z typu 'List' na 'finalSetOfNumbersFromTheFile' typu 'Set' ponieważ chcemy testować metodę 'howManyWins', która operuje na zmiennych typu 'Set';
        System.out.println("To fail the test we are testing now the following values: " + finalSetOfNumbersFromTheFile + ".");
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(finalSetOfNumbersFromTheFile), "Wrong numbers.");     //Nie rozumiem zapisu tego testu;
    }
}