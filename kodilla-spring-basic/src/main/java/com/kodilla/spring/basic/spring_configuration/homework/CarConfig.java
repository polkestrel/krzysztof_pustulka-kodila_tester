package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Random;

@Configuration
public class CarConfig {

    enum PartOfTheYear {SPRING, SUMMER, AUTUMN, WINTER};

    PartOfTheYear partOfTheYear;
    Car car;

    @Bean
    public SUV createSUV() {        // dlaczego konieczne jest utworzenie tych metod ?
        return new SUV();
    }

    @Bean
    public Sedan createSedan() {
        return new Sedan();
    }

    @Bean
    public Cabrio createCabrio() {
        return new Cabrio();
    }

    @Bean
    @Primary
    public Car getCar() {
        Random random = new Random();
        int season = random.nextInt(4);
        switch (season) {
            case 0:
                partOfTheYear = PartOfTheYear.SPRING;
                car = new Sedan();
                break;
            case 1:
                partOfTheYear = PartOfTheYear.SUMMER;
                car = new Cabrio();
                break;
            case 2:
                partOfTheYear = PartOfTheYear.AUTUMN;
                car = new Sedan();
                break;
            case 3:
                partOfTheYear = PartOfTheYear.WINTER;
                car = new SUV();
                break;
            default:
                System.out.println("Error");
        }
        //car.hasHeadLightsTurnedOn();
        return car;
    }
}
