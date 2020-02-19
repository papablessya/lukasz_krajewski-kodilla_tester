package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Stefan", "R8t", "Uber_Alles", "miss.Fortune", "dobra-Zm12"})
    public void validUserName(String text) {
        assertTrue(userValidator.validateUsername(text));
    }

    @ParameterizedTest
    @NullSource
    public void nullUserName(String text) {
        assertFalse(userValidator.validateUsername(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ed", "t&mek", "@#$%", "  "})
    public void inValidUserName(String text) {
        assertFalse(userValidator.validateUsername(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"dule_ule@tra.pl", "poka-me@tra.com", "Ambr12a@tra.pl"})
    public void validEmailAddress(String text) {
        assertTrue(userValidator.validateEmail(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {" ", "poka.poka2ts.pl", "oka.te.pl", "nudle11@.pl", "ana123.pl", "ron789@tru,pl"})
    public void inValidEmailAddress(String text) {
        assertFalse(userValidator.validateEmail(text));
    }

    @ParameterizedTest
    @NullSource
    public void nullEmailAddress(String text) {
        assertFalse(userValidator.validateEmail(text));
    }


}