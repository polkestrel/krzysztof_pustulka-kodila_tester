package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;


@SpringBootTest
class CarConfigTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration");

    @Test
    public void shouldCreateSUV() {
        //given
        SUV suv = context.getBean(SUV.class);
        //when
        String carType = suv.getCarType();
        //then
        Assertions.assertEquals("SUV", carType);
    }

    @Test
    public void shouldCreateSUVBeanAndFetchByBeanName() {
        //given
        SUV suv = (SUV) context.getBean("createSUV");
        //when
        String carType = suv.getCarType();
        //then
        Assertions.assertEquals("SUV", carType);
    }

    @Test
    public void shouldCreateCarBeanByRandomSeason() {
        //given
        Car car = (Car) context.getBean("getCar");
        //when
        String carType = car.getCarType();
        System.out.println(carType);
        //then
        List<String> possibleCarTypes = Arrays.asList("SUV", "Sedan", "Cabrio");
        Assertions.assertTrue(possibleCarTypes.contains(carType));
    }
}