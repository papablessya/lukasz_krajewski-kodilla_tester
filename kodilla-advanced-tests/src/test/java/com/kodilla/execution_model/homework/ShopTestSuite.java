package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import static com.kodilla.execution_model.homework.Shop.getMin;
import static com.kodilla.execution_model.homework.Shop.getSum;
import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();
    Order bike = new Order("John123", 890.5, LocalDate.of(2020, 1, 12));
    Order suitcase = new Order("OlivierX", 90.5, LocalDate.of(2020, 2, 22));
    Order table = new Order("SULTAN", 2890.5, LocalDate.of(2019, 11, 29));
    Order armchair = new Order("SULTAN", 999.1, LocalDate.of(2019, 11, 29));
    Order boots = new Order("Ike_Spike", 290.5, LocalDate.of(2020, 2, 17));


    @Test
    public void returnListOfOrdersBetweenTwoDates() {
        List<LocalDate> orders = Shop.getOrdersListBetweenTwoDates(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 2, 21));
        assertEquals(bike, orders);
        assertEquals(suitcase, orders);
        assertEquals(boots, orders);
    }

    @Test
    public void shouldShowMinValueOrder() {
//        double min = getSum(value)
//                .stream()
//                .mapToDouble(Order::getValue)
//                .min();

    }

    @Test
    public void shouldShowMaxValueOrder() {
        List<Order> maxValueOrder = Shop.getMax(90.5);
        Assertions.assertEquals(90.5, maxValueOrder);
    }

    @Test
    public void returnNumberOfOrders() {
        int numberOfOrders = shop.getSize();
        assertEquals(5, numberOfOrders);
    }
    @Test
    public void sumValueOfAllOrders(){
////        double sum = getSum(value)
//                .stream()
//                .mapToDouble(Order::getValue)
//                .sum();
    }


    @BeforeEach
    public void initializeOrder() {
        shop.addOrder(bike);
        shop.addOrder(suitcase);
        shop.addOrder(table);
        shop.addOrder(armchair);
        shop.addOrder(boots);
    }
}