package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleResults extends AbstractPage {

    //W linii [1] napisaliśmy selektor css do znalezienia kart przechowujących wyniki wyszukiwania.
    //W linii [2] tworzymy listę, w której będą przechowywane te karty.
    @FindBy(css = "div[class='g']")         //[1]
    private List<WebElement> results;       //[2]

    //W linii [3] tworzymy konstruktor, do którego przekazaliśmy drivera z poprzedniej klasy.
    //Dziedziczenie po AbstractPage wymusza na nas w linii [4], aby driver był przekazany do konstruktora tej klasy jako argument (super(driver)).
    //W linii [5] inicjalizujemy naszą stronę (w konstruktorze). Oznacza to tylko tyle, że gdy strona zostanie otwarta, będziemy mieć już dostęp do listy obiektów z linii [2]
    public GoogleResults(WebDriver driver) {                //[3]
        super(driver);                                      //[4]
        PageFactory.initElements(this.driver,this);     //[5]
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println("Number of results: " + results.size());
    }
}