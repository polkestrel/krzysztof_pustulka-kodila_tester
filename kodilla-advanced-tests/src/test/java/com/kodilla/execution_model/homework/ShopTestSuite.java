package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order laptop = new Order(254.45,LocalDate.of(2005,12,25),"Admin");
    Order armchair = new Order(25.47,LocalDate.of(2012,10,1),"John");
    Order lightBulb = new Order(0.45,LocalDate.of(2020,9,5),"Admiral");
    Order desk = new Order(105.41,LocalDate.of(2019,7,15),"Lem");
    Order hamster = new Order(21.15,LocalDate.of(2015,1,20),"Boy");
    Order book = new Order(15.14,LocalDate.of(2018,2,15),"Student");
    Order wardrobe = new Order(354.47,LocalDate.of(2019,4,7),"Achilles");


    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Let's begin now with the very first test...");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("...and that was the last test for today. That's it. Thank you!");
    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(laptop);
        shop.addOrder(armchair);
        shop.addOrder(lightBulb);
        shop.addOrder(desk);
        shop.addOrder(hamster);
        shop.addOrder(book);
        shop.addOrder(wardrobe);
    }

    @AfterEach
    public void resetValuesAfterEachTest() {
        System.out.println("----------------");
        System.out.println("...preparation for the another test...");;
        System.out.println("----------------");
    }

    // sprawdzanie czy dodaje prawidłowo zamówienia do listy.
    @Test
    public void shouldAddOrdersToOrderList() {
        //Then
        assertEquals(7, shop.orderList.size());
        System.out.println("First test accomplished.");
    }

    // sprawdzenie czy zwraca listę zamówień gdy podajemy prawidłowe daty
    @Test
    public void shouldReturnTheListOfOrdersWhenDatesAreCorrect() {
        //Then
        assertEquals(6,shop.getOrderListBasedOnTheRangeOfTwoDates(LocalDate.of(2010,1,1),LocalDate.of(2020,12,30)).size());
        System.out.println("Second test accomplished.");
    }

    // sprawdzenie czy zwraca listę zamówień w oparciu o prawidłowe wartości min/max zamówień
    @Test
    public void shouldReturnTheListOfOrdersWhenMinAndMaxAreBothCorrect() {
        //Then
        assertEquals(4, shop.getOrderListBasedOnTheMinAndMaxValue(0,30).size());
        System.out.println("Third test accomplished.");
    }

    // sprawdzenie czy dostaję właściwą ilość dokonanych zamówień
    @Test
    public void shouldReturnNumberOfAllOrders() {
        //Then
        assertEquals(7,shop.getTotalNumberOfOrders());
        System.out.println("Fourth test accomplished.");
    }

    // sprawdzenie czy zlicza prawidłowo sumę wszystkich zamówień
    @Test
    public void shouldReturnTotalValueOfAllOrders() {
        //Then
        assertEquals(776.54,shop.totalValueOfAllOrders());
    }
}