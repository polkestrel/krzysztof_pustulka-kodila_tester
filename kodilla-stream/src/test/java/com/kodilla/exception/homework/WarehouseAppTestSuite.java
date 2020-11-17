package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseAppTestSuite {

    @Test (expected = OrderDoesntExistException.class)
    public void isOrderNumberInUse_withException() throws OrderDoesntExistException {
        // given
        Warehouse.addOrder(new Order("0"));
        Warehouse.getOrder("5");
        // when
        // then
        Order expected = null;
        assertEquals(expected.getNumber(), Warehouse.getOrder("5").getNumber());
        assertNotEquals(expected.getNumber(), Warehouse.getOrder("0").getNumber());
    }
}