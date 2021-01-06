package com.kodilla.selenium.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleExample {
    public static void main(String[] args) {

        /*
        W liniach [1]-[3] tworzymy Selenium WebDriver i otwieramy stronę www.google.com
         */

        System.setProperty("webdriver.chrome.driver", "/SelfLearning/Selenium-drivers/Chrome/chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();      // [2]
        driver.get("https://www.google.com");       // [3]

        /*
        Linia [4] to wywołanie metody findElement(By by).
        Zwraca ona element typu WebElement na podstawie różnych kryteriów wyszukiwania:
        identyfikatora, klasy, selektora CSS, wyrażeń XPath i innych.
        W naszym przypadku używamy nazwy pola input ze strony WWW.
        W linii nr [5] do znalezionego elementu WebElement wysyłamy
        zasymulowane przyciśnięcia przycisków klawiatury. Wpisujemy w to pole szukaną frazę,
        czyli wyraz "Kodilla"
        W linii nr [6] zatwierdzamy wprowadzony tekst (czyli symulujemy wciśnięcia klawisza Enter w polu wyszukiwania)
         */

        //WebElement inputField = driver.findElement(By.name("q")); // [4]
        //inputField.sendKeys("Kodilla");     // [5]
        //inputField.submit();        // [6]
    }
}