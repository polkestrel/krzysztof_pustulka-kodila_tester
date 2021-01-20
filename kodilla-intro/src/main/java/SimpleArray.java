public class SimpleArray {
    public static void main(String[] args) {
        String[] books = new String[5];
        books[0] = "Diuna";
        books[1] = "Solaris";
        books[2] = "Niezwyciezony";
        books[3] = "Pirx";
        books[4] = "Wysoki Zamek";

        String book = books[2];

        System.out.println(book);

        int numberOfElements = books.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów.");
    }
}
