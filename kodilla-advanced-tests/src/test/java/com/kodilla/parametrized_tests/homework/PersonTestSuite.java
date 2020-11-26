package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideDataForDisplayingEachNotificationFromEachBmiRange")
    public void shouldCalculateBMIForEachRange(Person person) throws Exception {
        System.out.println(person.getBMI());
        //System.out.println("----------------------");
        //Stream<String> setOfAllNotificationsFromTheMethodPersonSource = new Stream<>(Arrays.asList(person.getBMI()));     // Wszystkie komunikaty umieszczam w zbiorze danych
        //System.out.println("The notification after using the next iteration of data from the following method: \n'PersonSources#provideDataForDisplayingEachNotificationFromEachBmiRange' is:\n" + setOfAllNotificationsFromTheMethodPersonSource);
        Stream<String> expectedNotifications= Stream.of("Very severely underweight","Severely underweight","Underweight","Normal (healthy weight)",
                "Overweight","Obese Class I (Moderately obese)", "Obese Class II (Severely obese)","Obese Class III (Very severely obese)",
                "Obese Class IV (Morbidly Obese)","Obese Class V (Super Obese)","Obese Class VI (Hyper Obese)");
        boolean match = expectedNotifications.anyMatch(un -> {
            try {
                return un.equals(person.getBMI());
            } catch (Exception e) {
                return false;
            }
        });
        assertTrue(match);
    }

     @ParameterizedTest
     @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#providingDataWithDenominatorEqualToZero")
     public void shouldNotCalculateBMIForDenominatorEqualToZero(Person person) {
        try {
            System.out.println(person.getBMI());
        } catch (Exception e) {
            System.out.println("Don't try to divide by zero");
        }
     }
}