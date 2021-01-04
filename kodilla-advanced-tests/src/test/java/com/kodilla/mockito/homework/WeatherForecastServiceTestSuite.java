package com.kodilla.mockito.homework;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WeatherForecastServiceTestSuite {

    WeatherForecastService weatherAlertService = new WeatherForecastService();
    User user = Mockito.mock(User.class);
    Location location = Mockito.mock(Location.class);
    WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);

    @BeforeAll
    public static void initiateTesting() {
        System.out.println("Beginning testing.");
    }

    @BeforeEach
    public void initializeTest() {
        System.out.println("Running test...");
    }

    @AfterEach
    public void endTest() {
        System.out.println("-----");
    }

    @AfterAll
    public static void closeTesting() {
        System.out.println("Ending testing.");
    }

    @Test
    public void notSubscribedPersonShouldNotReceiveNotifications() {
        weatherAlertService.addLocation(location);
        weatherAlertService.sendNotificationToLocation(weatherNotification, location);
        Mockito.verify(user, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void shouldAddLocation() {
        Location locationTwo = Mockito.mock(Location.class);
        weatherAlertService.addLocation(locationTwo);
        weatherAlertService.addSubscriber(user, locationTwo);
        Mockito.verify(locationTwo, Mockito.times(1)).receiveSubscriber(user);
    }

    @Test
    public void shouldAddSubscriberIfLocationIsInTheSystem() {
        weatherAlertService.addLocation(location);
        weatherAlertService.addSubscriber(user, location);
        Mockito.verify(location, Mockito.times(1)).receiveSubscriber(user);
    }

    @Test
    public void shouldAddSubscriberIfLocationWasNotTheSystem() {
        weatherAlertService.addSubscriber(user, location);
        Mockito.verify(location, Mockito.times(1)).receiveSubscriber(user);
    }

    @Test
    public void subscribedPersonShouldReceiveNotificationFromRightLocation() {
        weatherAlertService.addSubscriber(user, location);
        weatherAlertService.sendNotificationToLocation(weatherNotification, location);
        Mockito.verify(user, Mockito.times(1)).receive(weatherNotification);
    }

    @Test
    public void subscribedPersonShouldNotReceiveNotificationFromWrongLocation() {
        weatherAlertService.addSubscriber(user, location);
        Location locationTwo = Mockito.mock(Location.class);
        weatherAlertService.sendNotificationToLocation(weatherNotification, locationTwo);
        Mockito.verify(user, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void shouldUnsubscribePersonFromLocation() {
        weatherAlertService.addSubscriber(user, location);
        weatherAlertService.removeSubscriberFromLocation(user, location);
        Mockito.verify(location, Mockito.times(1)).removeSubscriber(user);
    }

    @Test
    public void personUnsubbedFromLocationShouldNotReceiveNotificationsFromLocation() {
        weatherAlertService.addSubscriber(user, location);
        weatherAlertService.removeSubscriberFromLocation(user, location);
        weatherAlertService.sendNotificationToLocation(weatherNotification, location);
        Mockito.verify(user, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void shouldUnsubscribePersonFromAll() {
        Location locationTwo = Mockito.mock(Location.class);
        weatherAlertService.addSubscriber(user, location);
        weatherAlertService.addSubscriber(user, locationTwo);
        weatherAlertService.removeSubscriberFromAllLocations(user);
        Mockito.verify(location, Mockito.times(1)).removeSubscriber(user);
        Mockito.verify(locationTwo, Mockito.times(1)).removeSubscriber(user);


    }
}