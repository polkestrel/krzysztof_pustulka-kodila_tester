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

    public void checkYearAndPrice() {
        if (this.year >= 2019) {
            if (this.price > 1000) System.out.println("This notebook is quite expensive but it's brand new.");
                else if (this.price >= 600) System.out.println("This notebook has a good price and it's brand new.");
                    else System.out.println("This notebook is very cheap and it's brand new. Take it !");
        }
        else {
            if (this.price > 1000) System.out.println("This notebook is quite expensive and it's old. Not a good choice.");
                else if (this.price >= 600) System.out.println("This notebook has a good price but it's old.");
                    else System.out.println("This notebook is very cheap probably because it is old.");
        }
    }
}