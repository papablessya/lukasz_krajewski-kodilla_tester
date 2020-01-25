package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> classes = new HashMap<>();
        Principal rodriguez = new Principal("Emanuel", "Rodriguez", "ZSZ");
        Principal lebowsky = new Principal("Big", "Lebowsky", "TM");
        Principal smith = new Principal("Wendy", "Smith", "IV LO");

        School rodriguezSchool = new School(31, 21, 23, 41);
        School lebowskySchool = new School(32, 21, 23, 31, 19);
        School smithSchool = new School(31, 29, 30);

        classes.put(rodriguez, rodriguezSchool);
        classes.put(lebowsky, lebowskySchool);
        classes.put(smith, smithSchool);

        for (Map.Entry<Principal, School> principalEntry : classes.entrySet())
            System.out.println("Mr." + principalEntry.getKey().getLastName() + " principal of " + principalEntry.getKey().getSchoolName()
                    + " with " + principalEntry.getValue().getSum() + " students total ");
    }
}
