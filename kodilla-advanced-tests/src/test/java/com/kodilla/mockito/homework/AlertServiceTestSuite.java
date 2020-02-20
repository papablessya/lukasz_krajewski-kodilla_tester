package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlertServiceTestSuite {

    AlertService alertService = new AlertService();
    Person person1 = Mockito.mock(Person.class);
    Person person2 = Mockito.mock(Person.class);
    Person person3 = Mockito.mock(Person.class);

    @Test
    public void shouldAddPersonToLocation() {
        alertService.addPerson(person1, Location.WARSAW);
//        alertService.alertAll();
//        Mockito.verify(person1, Mockito.times(1)).receive("Oj");
    }

    @Test
    public void personShouldReceiveAlertFromSubscribedLocation() {
        alertService.addPerson(person1, Location.WARSAW);
        alertService.addPerson(person3, Location.WARSAW);
        alertService.alertLocation(Location.WARSAW);
        Mockito.verify(person1, Mockito.times(1)).receive("Oj");
        Mockito.verify(person3, Mockito.times(1)).receive("Oj");
    }

    @Test
    public void personCanUnsubscribeFromSpecificLocation() {
        alertService.addLocation(Location.GDANSK);

        List<Person> result = alertService.locationAssignments.get(Location.GDANSK);
        assertEquals(result.size(), 0);
    }

    @Test
    public void personCanUnsubscribeFromAllLocations() {
        alertService.removePerson(person1, Location.WARSAW);
        alertService.removePerson(person1, Location.GDANSK);
        alertService.removePerson(person1, Location.KRAKOW);
        List<Person> result = alertService.locationAssignments.get(person1);
        assertEquals(result.size(), 0);


    }

    @Test
    public void AlertPersonsOnlySubscribedToSpecificLocation() {
        alertService.addPerson(person1, Location.WARSAW);
        alertService.addPerson(person2, Location.KRAKOW);
        alertService.addPerson(person3, Location.WARSAW);
        alertService.alertLocation(Location.WARSAW);
        Mockito.verify(person1, Mockito.times(1)).receive("Oj");
        Mockito.verify(person3, Mockito.times(1)).receive("Oj");
        Mockito.verify(person2, Mockito.never());


    }

    @Test
    public void shouldAlertAllSystemMessage() {
        alertService.addPerson(person1, Location.WARSAW);
        alertService.addPerson(person2, Location.GDANSK);
        alertService.addPerson(person3, Location.KRAKOW);
        alertService.alertAll();
        Mockito.verify(person1, Mockito.times(1)).receive("System Message");
        Mockito.verify(person2, Mockito.times(1)).receive("System Message");
        Mockito.verify(person3, Mockito.times(1)).receive("System Message");

    }

    @Test
    public void shouldDeleteSpecificLocation() {
        alertService.removeLocation(Location.WARSAW);

    }

}