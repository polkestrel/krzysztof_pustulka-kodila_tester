package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingAppWithCSS {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/SelfLearning/Selenium-drivers/Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        // Wybieram z rozwijanego okna kategorię Electronics... i coś tam
        WebElement searchField = driver.findElement(By.cssSelector("#gh-cat-box>select"));
        Select categorySelect = new Select(searchField);
        categorySelect = new Select(searchField);
        categorySelect.selectByValue("293");


        // W wyszukiwarce wpisuję 'Mavic mini' i wciskam enter
        WebElement inputField = driver.findElement(By.cssSelector("#gh-ac-box2>input"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

        // Po wyszukiwaniu czekam 10 sekund aż wyświelti się obrazek 'li>h2'
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li>h2")));

        // Po wyświetleniu się wyników wyszukiwania znajduję wszystkie karty produktów i przypisuje je do jednej listy
        List<WebElement> element = driver.findElements(By.cssSelector("div>ul[class*='srp-results srp-list clearfix']>li"));

        // wyświetl informacje o produkcie z utworzonej listy
        System.out.println("----------------------------------------");
        System.out.println("Ilość wyświetlonych produktów wynosi: " + element.size());
        System.out.println("----------------------------------------");
        System.out.println("Informacje o produkcie wyświetlonym jako pierwszy znajdują sie poniżej: " + "\n" + element.get(0).getText());
        System.out.println("----------------------------------------");

    }
}
