package com.kodilla.abstracts;

public class AnimalProcessor {

    /*
    Przykład polimorfizmu
    Metoda poniżej przyjmuje ogólny typ – każdy obiekt, który dziedziczy po Animal.
    Wywołanie animal.getNumberOfLegs() sygnalizuje, że z konkretnego (przekazanego)
    obiektu chcemy wywołać metodę getNumberOfLegs(). Nie oznacza to, że wywołujemy
    metodę z klasy abstrakcyjnej. Pamiętaj, że na podstawie klasy abstrakcyjnej
    nie możemy utworzyć obiektu. Poniższy zapis mówi, że dana metoda ma zostać
    wywołana z każdego obiektu, który jest podtypem Animal.
     */

    public void process(Animal animal) {
        System.out.println("Animal has " + animal.getNumberOfLegs() + " legs");
        animal.giveVoice();
    }
}
