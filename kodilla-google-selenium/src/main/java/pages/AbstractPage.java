package pages;

import org.openqa.selenium.WebDriver;

    /*
    Ta klasa będzie przechowywać nam instancję sterownika,
    a wszystkie klasy dziedziczące po niej będą zawsze miały do niego dostęp.
    */

public abstract class AbstractPage {
    protected WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }
}