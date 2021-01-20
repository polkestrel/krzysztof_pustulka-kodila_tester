package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private static List<Order> ordersList = new ArrayList<>();

    public static void addOrder(Order order) {
        ordersList.add(order);
        System.out.println("Order number: " + order + " has been just added.");
    }

    public static List<Order> getOrdersList() {
        return ordersList;
    }

    public static Order getOrder(String number) throws OrderDoesntExistException {
        System.out.println("Now you are looking for order number: " + number);
        return ordersList
                .stream()
                .filter(order -> order.getNumber().equals(order))
                .findFirst().orElseThrow(() -> new OrderDoesntExistException());
    }
}