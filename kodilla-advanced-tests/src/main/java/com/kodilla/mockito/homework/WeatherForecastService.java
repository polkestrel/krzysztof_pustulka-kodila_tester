package com.kodilla.mockito.homework;

import com.kodilla.parametrized_tests.homework.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherForecastService {

    private Map<Location, List<User>>locations = new HashMap<>();

    public void addLocation(Location location) {
        System.out.println("Adding location " + location);
        locations.put(location, new ArrayList<User>());
    }

    public void removeLocation(Location location) {
        System.out.println("Removing location " + location + " from the system.");
        for (Map.Entry<Location, List<User>> entry : locations.entrySet()) {
            if (entry.getKey().equals(location)) {
                for(User user : entry.getValue()) {
                    entry.getKey().removeSubscriber(user);
                }
            }
        }
        locations.remove(location);
    }

    public void addSubscriber(User user, Location location) {
        if (!locations.containsKey(location)) {
            System.out.println("Location not found. Adding location to the system.");
            this.addLocation(location);
        } else {
            System.out.println("Location found.");
        }
        for (Map.Entry<Location, List<User>> entry : locations.entrySet()) {
            if (entry.getKey().equals(location)) {
                entry.getValue().add(user);
                entry.getKey().receiveSubscriber(user);
                System.out.println("Adding subscriber " + user + " to location " + location);
            }
        }
    }

    public void removeSubscriberFromLocation(User user, Location location) {
        for (Map.Entry<Location, List<User>> entry : locations.entrySet()) {
            if(entry.getKey().equals(location) && entry.getValue().contains(user)) {
                entry.getValue().remove(user);
                entry.getKey().removeSubscriber(user);
                System.out.println("Removing subscriber " + user + " from location " + location + ".");
            }
        }
    }

    public void removeSubscriberFromAllLocations(User user) {
        for (Map.Entry<Location, List<User>> entry : locations.entrySet()) {
            if(entry.getValue().contains(user)) {
                entry.getValue().remove(user);
                entry.getKey().removeSubscriber(user);
            }
        }
        System.out.println("Removing subscriber " + user + " from all followed locations.");
    }

    public void sendNotificationToLocation(WeatherNotification weatherNotification, Location location) {
        for (Map.Entry<Location, List<User>> entry : this.locations.entrySet()) {
            if(entry.getKey().equals(location)) {
                entry.getValue().forEach(user -> user.receive(weatherNotification));
                System.out.println("Notification sent to subscribers of " + location);
            }
        }
    }

    public void sendNotificationToAll(WeatherNotification weatherNotification) {
        for (Map.Entry<Location, List<User>> entry : this.locations.entrySet()) {
            entry.getValue().forEach(user -> user.receive(weatherNotification));
            System.out.println("Notification sent to all.");
        }
    }
}
