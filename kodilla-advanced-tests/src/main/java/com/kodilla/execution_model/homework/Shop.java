package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Shop {

    Set<Order> orderList = new HashSet<>();

    public void addOrder(Order order) {
        this.orderList.add(order);
    }

    public List<Order> getOrderListBasedOnTheRangeOfTwoDates(LocalDate firstDateIsFurtherInThePast, LocalDate secondDateIsCloserToThePresent) {
        if (firstDateIsFurtherInThePast.isAfter(secondDateIsCloserToThePresent)) {
            System.out.println("Your dates are in wrong order." +
                    "Please bear in mind that your first date: " + firstDateIsFurtherInThePast + " has to be a date situated in time BEFORE your second date: " +
                    secondDateIsCloserToThePresent + ". Please correct and try again.");
            return null;
        }
        else if (firstDateIsFurtherInThePast.isAfter(LocalDate.now()) || secondDateIsCloserToThePresent.isAfter(LocalDate.now())) {
            System.out.println("Your dates are wrong. You can not choose dates from the future");
            return null;
        }
        List<Order> twoDatesList = orderList
                .stream()
                .filter(o -> o.getDate().isAfter(firstDateIsFurtherInThePast))
                .filter(on -> on.getDate().isBefore(secondDateIsCloserToThePresent))
                .collect(Collectors.toList());
        if (twoDatesList.isEmpty()) {
            System.out.println("There is no orders within chosen timeframe. Pick another two dates.");
            return null;
        }
        System.out.println("Your list based on two dates contains the following list of orders: " + twoDatesList);
        return twoDatesList;
    }

    public List<Order> getOrderListBasedOnTheMinAndMaxValue(double minValue, double maxValue) {
        if (minValue > maxValue) {
            System.out.println("Minimum value (" + minValue + ") of the order has to be lower" +
                    " than max value (" + maxValue + ") of the order. Try again.");
            return null;
        } else if (minValue == maxValue) {
            System.out.println("Hey! You have typed two values which are equal. Try again.");
        }
        List<Order> twoValuesList = orderList
                .stream()
                .filter(r -> r.getValue() >= minValue)
                .filter(or -> or.getValue() <= maxValue)
                .collect(Collectors.toList());
        if (twoValuesList.isEmpty()) {
            System.out.println("Your list is empty as there is no orders with values between: (min Value" + minValue + " " +
                    "and (max Value) " + maxValue);
            return null;
        }
        System.out.println("Your list based on min and max value contains the following list of orders: " + twoValuesList);
        return twoValuesList;
    }

    public Integer getTotalNumberOfOrders() {
        if (orderList.isEmpty()) {
            System.out.println("Sorry, but there has been no orders so far.");
        }
        System.out.println("Total number of orders is equal to: " + orderList.size());
        return orderList.size();
    }

    public double totalValueOfAllOrders () {
        if (orderList.isEmpty() || orderList.size() == 0) {
            System.out.println("Total value of all orders is equal to zero.");
            return 0;
        }
        double totalSum = 0;
        for (Order order : orderList) {
            totalSum = totalSum + order.getValue();
        }
        System.out.println("The total summation of all orders on the list is equal to: " + totalSum);
        return totalSum;
    }
}
