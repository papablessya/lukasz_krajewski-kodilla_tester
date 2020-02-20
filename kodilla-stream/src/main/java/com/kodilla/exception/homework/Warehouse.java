package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Warehouse {
    private Set<Order> orders = new HashSet<>();


    public void addOrder(Order order) {
        this.orders.add(order);

    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Order orderNr = orders.stream()
                .filter(x -> x.getNumber().equals(number))
                .findFirst()
                .orElseThrow(OrderDoesntExistException::new);

        return orderNr;
    }

}
