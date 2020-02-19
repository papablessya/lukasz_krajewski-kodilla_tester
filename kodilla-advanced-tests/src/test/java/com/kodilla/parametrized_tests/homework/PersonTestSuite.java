package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

//class PersonTestSuite {
//    private Person person = new Person(Stream.of(PersonSources.personWeight()),Stream.of(PersonSources.personHeight()));
//    @ParameterizedTest
//    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#personHeight" + "com.kodilla.parametrized_tests.homework.PersonSources#personWeight")
//    public void ShouldGetBMI(double input, double expected) {
//        assertEquals(expected, person.getBMI());
//    }
//}