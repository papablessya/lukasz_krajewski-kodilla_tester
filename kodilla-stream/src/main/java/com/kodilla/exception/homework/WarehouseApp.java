package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class WarehouseApp {
    public static void main(String[] args) {
        Set<Order> orders = new HashSet<>();
        orders.add(new Order("order2"));
        orders.add(new Order("order3"));
        orders.add(new Order("order4"));

        for (Order order : orders)
            System.out.println(order);

    }
}
