package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class GoogleSearch extends AbstractPage {

    // Wyszukanie selektora dla pola tekstowego.
    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    // Wyszukanie selektora dla przycisku szukania [A]
    @FindBy(css = "input[value='Szukaj w Google']")
    static List<WebElement> searchButton;   //[A]
    private GoogleResults googleResults; //zdefiniowano globalną zmienną przechowującą instancję strony z wynikami wyszukiwania

    // Linia [B] dodaliśmy konstruktor dla strony wyszukiwania analogicznie, jak dla strony wyników.
    public GoogleSearch(WebDriver driver) {                  // [B]
        super(driver);
    }

    public void searchResults() {
        PageFactory.initElements(driver, GoogleSearch.class);

        // Przełączenie się na wyskakujące okienko i zaakceptowanie 'cookies'
        driver.switchTo().frame(0);
        WebElement consentButton = driver.findElement(By.cssSelector("#introAgreeButton"));
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(consentButton)).click();
        //driver.switchTo().frame(0);
        //WebElement inputButton = driver.findElement(By.xpath("//html/body/div/c-wiz/div/div/div/div/div/div[2]/form/div/span/span"));
        //inputButton.click();

        inputField.sendKeys("Kodilla");
        googleResults = loadResults(driver);
        googleResults.iSeeResults();

    }

    public static GoogleResults loadResults(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        // Linia [4] - czekamy aż przycisk "Szukaj" będzie aktywny,
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();   //[4]
        // aby nasz kod podczas wykonywania się nie wyrzucał błędu NullPointerException,
        // musimy stworzyć obiekt klasy GoogleResults i go zwrócić.
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }
}