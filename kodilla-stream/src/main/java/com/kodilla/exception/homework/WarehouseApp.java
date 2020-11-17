package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse.addOrder(new Order("1200"));
        Warehouse.addOrder(new Order("10"));
        Warehouse.addOrder(new Order("15"));
        Warehouse.addOrder(new Order("12"));
        Warehouse.addOrder(new Order("100"));

        System.out.println("------------------------");

        try {
            Warehouse.getOrder("5");
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry the order number that you have just typed - doesn't exist in our database. Please choose another one.");
        } finally {
            System.out.println("The process has been finalized.");
        }
    }
}
