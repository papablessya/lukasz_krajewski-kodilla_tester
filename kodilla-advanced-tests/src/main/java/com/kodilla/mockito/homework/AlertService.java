package com.kodilla.mockito.homework;

import java.util.HashSet;
import java.util.Set;

public class AlertService {
    private Set<Person> persons = new HashSet<>();
    private Set<Location> locations = new HashSet<>();


    public void addPerson(Person person) {
        this.persons.add(person);
    }

    public void removePerson(Person person){
        this.persons.remove(person);
    }
    public void addLocation(Location location){
        this.locations.add(location);

    }
    public void removeLocation(Location location){
        this.locations.remove(location);
    }
    public void sendAlert(Alert alert){
        this.persons.forEach(person -> person.receive(alert));
    }
        }
