package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/SelfLearning/Selenium-drivers/Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://pl-pl.facebook.com/r.php?locale=pl_PL&display=page");

        /*
        Wyszukanie przycisku akceptującego ciasteczka i zaakceptowanie
         */
        WebElement inputButton = driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div/button[2]"));
        inputButton.click();


        /*
        Po pierwsze, przed znakami cudzysłowu wewnątrz wyrażenia XPath musieliśmy dodać znak \\,
        dzięki czemu Java wie, że nie jest to cudzysłów zamykający, lecz fragment Stringa.
        Po drugie, zmieniliśmy div na * na samym początku selektora, dzięki czemu uodporniliśmy program na wypadek zmiany diva
        na inny typ tagu. Zastosowana gwiazdka uchwyci tag dowolnego typu, o ile będzie on posiadał identyfikator id="birthday_wrapper".
        Następnie musieliśmy dodać fragment "/div/span/span", ponieważ nasz select nie leży bezpośrednio na divie o wspomnianym identyfikatorze.
        Pomiędzy naszym selectem i divem znajduje się jeszcze inny div oraz dwa tagi span.
         */
        WebElement yearCombo = driver.findElement(By.xpath("//*[@id=\"birthday_wrapper\"]/div/span/span/select[3]"));
        Select yearSelect = new Select(yearCombo);
        yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);



        /*
        W linii nr [1] tworzymy obiekt typu WebElement.
        W linii nr [2] używamy stworzonego obiektu klasy WebElement do utworzenia obiektu klasy Select. Obiekt ten umożliwi nam operowanie na dostępnych do wyboru opcjach.
        Linia nr [3] to poinstruowanie obiektu klasy Select, aby wybrał z listy rozwijalnej pozycję pod indeksem 5 (indeksy numerowane są od zera).
         */
        //WebElement yearCombo = driver.findElement(By.xpath("//select[3]"));     // [1]
        //Select yearSelect = new Select(yearCombo);                              // [2]
        //yearSelect.selectByIndex(5);                                            // [3]
    }
}
