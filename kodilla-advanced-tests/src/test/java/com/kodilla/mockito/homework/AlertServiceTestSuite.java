package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AlertServiceTestSuite {

    AlertService alertService = new AlertService();
    Person person = Mockito.mock(Person.class);
    Location location = Mockito.mock(Location.class);
    Alert alert = Mockito.mock(Alert.class);

    @Test
    public void shouldAddPersonToLocation() {
        alertService.addPerson(person);
        alertService.addLocation(location);



    }

    @Test
    public void personShouldReceiveAlertFromSubscribedLocation() {

    }

    @Test
    public void personCanUnsubscribeFromSpecificLocation() {

    }

    @Test
    public void personCanUnsubscribeFromAllLocations() {

    }

    @Test
    public void AlertPersonsOnlySubscribedToSpecificLocation() {

    }

    @Test
    public void shouldAlertAllSystemMessage() {

    }

    @Test
    public void shouldDeleteSpecificLocation() {

    }

}