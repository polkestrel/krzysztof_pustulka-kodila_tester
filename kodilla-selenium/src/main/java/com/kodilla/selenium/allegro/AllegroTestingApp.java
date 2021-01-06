package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) {
        // otwórz w przeglądarce portal Allegro, a następnie przełącz kategorię produktów na Elektronika
        // i w polu wyszukiwania wpisz "Mavic mini"
        // Korzystając z XPath-Relative, napisz kod ustawiający żądane wartości
        // w polach kryteriów wyszukiwania oraz kliknij w przycisk "Szukaj".

        System.setProperty("webdriver.chrome.driver", "/SelfLearning/Selenium-drivers/Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

    }
}
