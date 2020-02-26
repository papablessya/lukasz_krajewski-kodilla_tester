package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarehouseTestSuite {

    @Test(expected = OrderDoesntExistException.class)

    public void TestGetOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        Order order = warehouse.getOrder(null);
        assertEquals(null, order);
    }
}

