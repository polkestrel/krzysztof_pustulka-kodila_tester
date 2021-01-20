package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {

        // Sprawdzić WebdriverManager - sprawdzić.
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        //driver.get("https://allegro.pl/");
        //driver.navigate().to("http://www.allegro.pl/");;

        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"gh-cat-box\"]/select"));
        Select categorySelect = new Select(searchField);
        categorySelect = new Select(searchField);
        categorySelect.selectByValue("293");

        WebElement inputField = driver.findElement(By.xpath("//*[@id=\"gh-ac-box2\"]/input"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
    }
}
