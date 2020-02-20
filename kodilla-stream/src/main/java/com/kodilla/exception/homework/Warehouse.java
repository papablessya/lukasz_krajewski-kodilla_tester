package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        this.orders.add(order);

    }

    public static Order getOrder(String number) {
        String n = Warehouse.getOrder()
        .stream()
        .map(u -> u)



    }
}
