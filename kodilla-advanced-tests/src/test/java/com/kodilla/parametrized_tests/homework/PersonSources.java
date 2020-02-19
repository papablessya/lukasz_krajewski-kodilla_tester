package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> personHeight() {
        return Stream.of(
                Arguments.of(1.81),
                Arguments.of(1.61),
                Arguments.of(1.85),
                Arguments.of(1.73),
                Arguments.of(1.91)
        );
    }

    static Stream<Arguments> personWeight() {
        return Stream.of(
                Arguments.of(81.1),
                Arguments.of(63.7),
                Arguments.of(190.1),
                Arguments.of(65.3),
                Arguments.of(230.3)
        );
    }
}