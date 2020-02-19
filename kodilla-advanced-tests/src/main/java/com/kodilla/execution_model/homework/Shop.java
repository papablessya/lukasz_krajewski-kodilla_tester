package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public static List<LocalDate> getOrdersListBetweenTwoDates(LocalDate startDate, LocalDate endDate) {
        return startDate.datesUntil(endDate)
                .collect(Collectors.toList());
    }

    public static List<Order> getMin(double value) {
        double min = getMin(value)
                .stream()
                .mapToDouble(Order::getValue)
                .min()
                .orElse(0.00);
        return getMin(value);
    }

    public static List<Order> getMax(double value) {
        double max = getMax(value)
                .stream()
                .mapToDouble(Order::getValue)
                .max()
                .orElse(0.00);
        return getMax(value);


    }

    public int getSize() {
        return this.orders.size();
    }

    public static List<Order> getSum(double value) {
        double sum = getSum(value)
                .stream()
                .mapToDouble(Order::getValue)
                .sum();
        return getSum(value);
    }
}
