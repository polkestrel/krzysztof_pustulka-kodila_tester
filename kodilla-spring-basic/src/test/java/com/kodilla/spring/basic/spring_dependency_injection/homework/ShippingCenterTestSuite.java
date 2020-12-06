package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ShippingCenterTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
    ShippingCenter shippingBean = context.getBean(ShippingCenter.class);
    DeliveryService deliverBean = context.getBean(DeliveryService.class);
    NotificationService notificationBean = context.getBean(NotificationService.class);
    String success = notificationBean.success("Poland");
    String fail = notificationBean.fail("Nowhere");

    @Test
    public void shouldDeliverPackageWhenWeightIsBelow30Kilos() {
        boolean delivered = deliverBean.deliverPackage("Home", 29);
        assertTrue(delivered);
    }

    @Test
    public void shouldNotDeliverPackageWhenWeightIsAbove30Kilos() {
        boolean notDelivered = deliverBean.deliverPackage("Home", 31);
        assertFalse(notDelivered);
    }

    @Test
    public void shouldReturnSuccessMessageIfSentPackage() {
        String sent = shippingBean.sendPackage("Poland", 29.0);
        assertEquals(success, sent);
    }

    @Test
    public void shouldReturnFailMessageIfNotSentPackage() {
        String sent = shippingBean.sendPackage("Nowhere", 31.0);
        assertEquals(fail, sent);
    }
}