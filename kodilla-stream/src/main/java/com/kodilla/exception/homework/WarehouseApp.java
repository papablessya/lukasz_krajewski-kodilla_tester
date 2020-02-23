package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
//        Set<Order> orders = new HashSet<>();
//        orders.add(new Order("order2"));
//        orders.add(new Order("order3"));
//        orders.add(new Order("order4"));
//
//        for (Order order : orders)
//            System.out.println(order);
            Warehouse warehouse = new Warehouse();

            warehouse.addOrder(new Order("ONR 1"));
            warehouse.addOrder(new Order("ONR 2"));

            warehouse.getOrder("ORD XXXX");
           try {
               Order isOrderinUse = warehouse.getOrder("order");
               System.out.println("Order status" + isOrderinUse);
           }catch (OrderDoesntExistException e){
               System.out.println("no order");
           }finally {
               System.out.println("please call us :9292929");
           }
    }
    }

