package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    @ParameterizedTest
    @CsvFileSource(resources = "/numbersToTest.csv")
    public void test1(Set<Integer> userNumbers){
//    GamblingMachine gamblingMachine = new HashSet<>();
    }




}