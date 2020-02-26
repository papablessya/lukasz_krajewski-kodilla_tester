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
        alertService.addPerson(person1,Location.GDANSK);
        alertService.addPerson(person1,Location.WARSAW);
        List<Person> result = alertService.locationAssignments.get(Location.WARSAW);
        assertEquals(result.size(), 1);

        alertService.removePerson(person1, Location.WARSAW);

        result = alertService.locationAssignments.get(Location.WARSAW);
        assertEquals(result.size(), 0);
    }

    @Test
    public void personCanUnsubscribeFromAllLocations() {
        // given
        alertService.addPerson(person1, Location.WARSAW);
        List<Person> result = alertService.locationAssignments.get(Location.WARSAW);
        assertEquals(result.size(), 1);

        // when
        alertService.removePerson(person1, Location.WARSAW);

        // then
        result = alertService.locationAssignments.get(Location.WARSAW);
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
        // given
        alertService.addLocation(Location.WARSAW);
        alertService.addPerson(person1, Location.WARSAW);
        List<Person> result = alertService.locationAssignments.get(Location.WARSAW);
        assertEquals(result.size(), 1);

        // when
        alertService.removeLocation(Location.WARSAW);

        // then
        result = alertService.locationAssignments.get(null);
        assertEquals(result.size(),1);
    }

}