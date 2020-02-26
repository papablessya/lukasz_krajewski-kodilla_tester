package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {

        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("ONR 1"));
        warehouse.addOrder(new Order("ONR 2"));

        warehouse.getOrder("ONR 1");
        try {
            Order order = warehouse.getOrder("ONR XXX");
            System.out.println("Order status" + order);
        } catch (OrderDoesntExistException e) {
            System.out.println("no order");
        } finally {
            System.out.println("If you have a question please call us :9292929");
        }
    }
}

