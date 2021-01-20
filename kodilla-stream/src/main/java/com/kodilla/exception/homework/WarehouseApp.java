package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse.addOrder(new Order("1200"));
        Warehouse.addOrder(new Order("10"));
        Warehouse.addOrder(new Order("15"));
        Warehouse.addOrder(new Order("12"));
        Warehouse.addOrder(new Order("100"));

        System.out.println("------------------------");

//        try {
//            System.out.println(Warehouse.getOrdersList());
//            Warehouse.getOrder("1");
//        } catch (OrderDoesntExistException e) {
//            System.out.println("Sorry the order number that you have just typed - doesn't exist in our database. Please choose another one.");
//        } finally {
//            System.out.println("The process has been finalized.");
//        }


        try {
            Warehouse.getOrder("15");
            throw new OrderDoesntExistException();
            } catch (OrderDoesntExistException e) {
            System.out.println("Order number not found. Try again.");
        }
    }
}
