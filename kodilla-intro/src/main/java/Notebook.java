import java.awt.desktop.SystemEventListener;

public class Notebook {

    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price <= 1000) {
            if (this.price >= 600)
                System.out.println("This price is good");
            else
                System.out.println("This notebook is very cheap");
        } else {
            System.out.println("This notebook is quite expensive");
        }
    }

    public void checkWeight() {
        if (this.weight <= 1500) {
            if (this.weight >= 1000)
                System.out.println("This notebook is not too heavy");
            else
                System.out.println("This notebook is light");
        } else {
            System.out.println("This notebook is very heavy");
        }
    }

    public void checkYearAndPrice() {                       // Dobrze by było dopracować tą pętlę i rozwinąć wszystkie przypadki możliwe
        if (this.price >= 1000 && this.year >= 2019)
            System.out.println("This notebook is quite expensive but it's brand new.");
        else if (this.price >= 600 && this.year >= 2019)
            System.out.println("This notebook has a good price and it's brand new.");
    }
}