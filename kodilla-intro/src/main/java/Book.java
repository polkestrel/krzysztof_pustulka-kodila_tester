public class Book {
    private static Book book;
    private String author;
    private String title;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    static Book of(String author, String title) {
        return book;
    }

    public static void main(String[] args) {

            Book book = Book.of("Isaac Asimov", "The Galaxy");
            System.out.println(book.getAuthor() + " " + book.getTitle());
        }
    }