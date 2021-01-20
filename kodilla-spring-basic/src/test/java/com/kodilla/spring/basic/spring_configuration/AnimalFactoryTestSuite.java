package com.kodilla.spring.basic.spring_configuration;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class AnimalFactoryTestSuite {
/*
    @Test
    public void testDogCreated() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Dog dog = context.getBean(Dog.class);
        //When
        String voice = dog.getVoice();
        //Then
        Assertions.assertEquals("Bark bark", voice);
    }
*/

    // Gdy bean jest tworzony przy pomocy adnotacji @Component,
    // jego domyślną nazwą jest nazwa klasy pisana małą literą, np. "dog".
    // W przypadku beanów tworzonych przy pomocy adnotacji @Bean domyślną nazwą beana jest
    // nazwa metody tworzącej beana, np. randomAnimal.
    // Dotychczas, pobierając beany z kontekstu, korzystaliśmy z metody getBean(Class class),
    // która jako argument przyjmowała typ beana, jaki miał zostać pobrany.
    // Jest też druga wersja metody o tej samej nazwie – getBean(String name).

    // W poniższym teście pobieramy beana po nazwie – musimy przekazać łańcuch znaków createDog
    // do metody getBean(String name), ponieważ taką nazwę nosi metoda tworząca beana typu Dog w klasie
    // AnimalFactory. Konieczne jest również rzutowanie. Pobierając beana po nazwie, zawsze otrzymujemy
    // typ Object. Na osobie piszącej kod spoczywa obowiązek odpowiedniego określenia typu otrzymanego obiektu.
    // Innymi słowy, programista musi wskazać, jak ma być traktowany obiekt: czy ma być to np. Animal, czy Dog.
    @Test
    public void shouldCreateDogBeanAndFetchByBeanName() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Dog dog = (Dog) context.getBean("createDog");
        //When
        String voice = dog.getVoice();
        //Then
        Assertions.assertEquals("Bark bark", voice);
    }

    // W poniższym teście na początku wyszukujemy beana po nazwie randomAnimal,
    // wynik rzutujemy na Animal (pomocne jest zweryfikowanie zwracanego typu w stosunku do klasy
    // AnimalFactory). Dalej wywołujemy metodę getVoice(), ale to powinno być już dla Ciebie oczywiste.
    // W następnej linii tworzymy listę dopuszczalnych wartości: musi to być lista, ponieważ nie wiemy,
    // jaki typ zwierzęcia zostanie zwrócony. W asercji weryfikujemy, czy otrzymana wartość znajduje się
    // w nowo utworzonej kolekcji.
    @Test
    public void shouldCreateRandomAnimal() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Animal animal = (Animal) context.getBean("randomAnimal");
        //When
        String voice = animal.getVoice();
        System.out.println(voice);
        //Then
        List<String> possibleVoices = Arrays.asList("Bark bark", "Meow meow", "Quack quack");
        Assertions.assertTrue(possibleVoices.contains(voice));
    }
}