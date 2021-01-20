package com.kodilla.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MobilePhoneTestSuite {

    // Utworzenie test double.
    // Pierwsza część nazwy dublera z pewnością jest Ci znana: tworzymy typ referencji,
    // a następnie podajemy jej nazwę. Dalej wykorzystujemy metodę statyczną z klasy Mockito.
    // Jako argument podajemy typ klasy, na podstawie którego ma zostać utworzony test double.
    // Po nazwie klasy musimy użyć składni .class – w ten sposób w przekazujemy Javie typ,
    // a nie konkretną wartość.
    // Zauważ, że tworząc mocka nie użyliśmy słowa new.
    // Test doubles za pomocą Mockito możemy tworzyć na podstawie klas i interfejsów.
    MobilePhone myPhone = Mockito.mock(MobilePhone.class);


    @Test
    public void testDefaultBehaviourOfTestDouble() {
        Assertions.assertFalse(myPhone.needsCharging());
        Assertions.assertEquals(0.0, myPhone.getFreeStorage());
    }

    @Test
    public void testExpectation() {
        Assertions.assertFalse(myPhone.needsCharging());
        Mockito.when(myPhone.needsCharging()).thenReturn(true);
        Assertions.assertTrue(myPhone.needsCharging());
    }

    // Metoda launchApplication(); jest typu void: naciśnięcie ikony aplikacji w
    // telefonie wysyła jedynie urządzeniu sygnał, by podjęło odpowiednie działania,
    // by uruchomić żądany program. Metoda ta nic nie zwraca, ale wciąż możemy ją
    // przetestować za pomocą Mockito.
    @Test
    public void shouldCallLaunchApplication() {
        myPhone.launchApplication("Tetris4D");
        Mockito.verify(myPhone).launchApplication("Tetris4D");
    }

//    @Test
//    public void testVerificationFailure() {
//        myPhone.needsCharging();
//        Mockito.verify(myPhone).getFreeStorage();
//    }
}