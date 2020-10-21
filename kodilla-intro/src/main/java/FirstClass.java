public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 100, 1998);     // Tworzenie obiektu zgodnie z definicją: TypZmiennej nazwaZmiennej = new NazwaKlasy();
        refactor(notebook);

        Notebook heavyNotebook = new Notebook(2000, 1100, 2005);
        refactor(heavyNotebook);

        Notebook oldNotebook = new Notebook(1200, 1000, 2020);
        refactor(oldNotebook);
    }

    private static void refactor(Notebook notebook) {
        System.out.println("Weight: " + notebook.weight + "g;" + " " + "Price: " + notebook.price + "PLN;" + " " + "Year of manufacture: " + notebook.year);   // wyświetlenie zmiennej 'weight' z obiektu o nazwie 'notebook' zgodnie z definicją: nazwaObiektu.nazwaZmiennej
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();
    }
}
