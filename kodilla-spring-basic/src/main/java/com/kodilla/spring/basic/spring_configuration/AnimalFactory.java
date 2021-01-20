package com.kodilla.spring.basic.spring_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class AnimalFactory {

    @Bean
    public Dog createDog() {
        return new Dog();
    }


    // Gdy bean jest tworzony przy pomocy adnotacji @Component,
    // jego domyślną nazwą jest nazwa klasy pisana małą literą, np. "dog".
    // W przypadku beanów tworzonych przy pomocy adnotacji @Bean domyślną nazwą beana jest
    // nazwa metody tworzącej beana, np. randomAnimal.
    // Dotychczas, pobierając beany z kontekstu, korzystaliśmy z metody getBean(Class class),
    // która jako argument przyjmowała typ beana, jaki miał zostać pobrany.
    // Jest też druga wersja metody o tej samej nazwie – getBean(String name).
    @Bean
    public Animal randomAnimal() {
        Animal animal;
        Random generator = new Random();
        int chosen = generator.nextInt(3);
        if (chosen == 0) {
            animal = new Dog();
        } else if (chosen == 1) {
            animal = new Cat();
        } else {
            animal = new Duck();
        }
        return animal;
    }
}