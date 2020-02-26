package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private static List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public static List<LocalDate> getOrdersListBetweenTwoDates(LocalDate startDate, LocalDate endDate) {
        return startDate.datesUntil(endDate)
                .collect(Collectors.toList());
    }

    public static double getMin() {
        return orders
                .stream()
                .mapToDouble(Order::getValue)
                .min()
                .orElse(0.00);
    }

    public static double getMax() {
        return orders
                .stream()
                .mapToDouble(Order::getValue)
                .max()
                .orElse(0.00);

    }

    public int getSize() {
        return this.orders.size();
    }

    public static double getSum() {
        return orders
                .stream()
                .mapToDouble(Order::getValue)
                .sum();
    }
}
