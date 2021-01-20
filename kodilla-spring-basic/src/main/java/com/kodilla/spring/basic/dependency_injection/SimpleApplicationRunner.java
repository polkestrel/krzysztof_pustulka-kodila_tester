package com.kodilla.spring.basic.dependency_injection;

public class SimpleApplicationRunner {

    public static void main(String[] args) {

        // Na początku tworzymy obiekt FacebookMessageService,
        // przypisujemy go do referencji typu MessageService
        // (możemy tak zrobić, ponieważ MessageService jest typem wyższym,
        // w drugą stronę to nie zadziała), a następnie przekazujemy do konstruktora
        // klasy SimpleApplication.
        // SimpleApplication otrzymuje zależność z zewnątrz.
        MessageService messageService = new FacebookMessageService();
        SimpleApplication application = new SimpleApplication(messageService);
        application.processMessage("Test message", "receiver@mail.com");
    }
}