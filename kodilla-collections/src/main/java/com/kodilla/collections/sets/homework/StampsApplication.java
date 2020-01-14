package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Colin",2.1,1999, true));
        stamps.add(new Stamp("Frank",3.9,1979, false));
        stamps.add(new Stamp("Emily",1.1,2001, false));
        stamps.add(new Stamp("John",3.2,1971, true));
        stamps.add(new Stamp("Frank",3.9,1979, false));
        stamps.add(new Stamp("Winston",2.9,1981, true));
        stamps.add(new Stamp("Frank",3.9,1979, false));

        System.out.println(stamps.size());
            for(Stamp stamp : stamps)
                System.out.println(stamp);



    }
}
