package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.time.LocalTime;

@SpringBootTest
class ClockTestSuite {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes");

        @Test
        public void shouldCreateDifferentTimes() {
            Clock firstTimeBean = (Clock) context.getBean("clock", LocalTime.of(23,25,55));
            Clock secondTimeBean = (Clock) context.getBean("clock", LocalTime.of(23,25,55));
            Clock thirdTimeBean = (Clock) context.getBean("clock", LocalTime.of(11,14,17));
            Assertions.assertNotEquals(firstTimeBean,secondTimeBean);
            Assertions.assertNotEquals(firstTimeBean,thirdTimeBean);
            Assertions.assertNotEquals(thirdTimeBean,secondTimeBean);
            Assertions.assertEquals(firstTimeBean,firstTimeBean);
        }
    }