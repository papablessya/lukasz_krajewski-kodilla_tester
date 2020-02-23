package com.kodilla.mockito.homework;

import java.util.*;

public class AlertService {

    Map<Location, List<Person>> locationAssignments = new HashMap<>();

    public void addPerson(Person person, Location location) {
        locationAssignments.putIfAbsent(location, new ArrayList<>());
        List<Person> personList = locationAssignments.get(location);
        personList.add(person);
    }
    public void removePerson(Person person,Location location){
        List<Person> personList = locationAssignments.get(location);
        personList.remove(person);
    }
    public void alertAll(){
        locationAssignments.values().forEach(personList -> personList.forEach(person -> person.receive("System Message")));
    }
    public void alertLocation(Location location){
        locationAssignments.getOrDefault(location, new ArrayList<>()).forEach(person -> person.receive("Oj"));
    }
    public void addLocation(Location location){
        locationAssignments.putIfAbsent(location, new ArrayList<>());
    }
    public void removeLocation(Location location){
        locationAssignments.remove(location, null);
    }


}






