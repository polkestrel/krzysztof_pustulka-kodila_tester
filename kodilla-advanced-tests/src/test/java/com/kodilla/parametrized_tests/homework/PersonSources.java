package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {


    private static Stream<Arguments> provideDataForDisplayingEachNotificationFromEachBmiRange() {
        return Stream.of(
                Arguments.of(new Person(1.0,14.99)),
                Arguments.of(new Person(1.0,15.99)),
                Arguments.of(new Person(1.0,18.49)),
                Arguments.of(new Person(1.0,24.99)),
                Arguments.of(new Person(1.0,29.99)),
                Arguments.of(new Person(1.0,34.99)),
                Arguments.of(new Person(1.0,39.99)),
                Arguments.of(new Person(1.0,44.99)),
                Arguments.of(new Person(1.0,49.99)),
                Arguments.of(new Person(1.0,59.99)),
                Arguments.of(new Person(1.0,60.00))
        );
    }

    private static Stream<Arguments> providingDataWithDenominatorEqualToZero() {
        return Stream.of(
                Arguments.of(new Person(0.0,0.00)),
                Arguments.of(new Person(0.0,14.99))
        );
    }
}
