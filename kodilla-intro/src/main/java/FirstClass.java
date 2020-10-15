public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600,100, 1998);     // Tworzenie obiektu zgodnie z definicją: TypZmiennej nazwaZmiennej = new NazwaKlasy();
        System.out.println("Weight: " + notebook.weight + "g;" + " " + "Price: " + notebook.price + "PLN;" + " " + "Year of manufacture: " + notebook.year);   // wyświetlenie zmiennej 'weight' z obiektu o nazwie 'notebook' zgodnie z definicją: nazwaObiektu.nazwaZmiennej
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000,1100, 2005);
        System.out.println("Weight: " + heavyNotebook.weight + "g;" + " " + "Price: " + heavyNotebook.price + "PLN;" + " " + "Year of manufacture: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(1200,1000, 2020);
        System.out.println("Weight: " + oldNotebook.weight +"g;" + " " + "Price: " + oldNotebook.price + "PLN;" + " " + "Year of manufacture: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();


        /*
        if (notebook.price<900) {
            System.out.println("This notebook is cheap");
        } else {
            System.out.println("This notebook is quite expensive");
        }
        */

    }
}
