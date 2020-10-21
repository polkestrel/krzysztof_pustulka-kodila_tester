public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    static Book of(String author, String title) {
        return new Book(author, title);
    }

    public static void main(String[] args) {
            Book book = Book.of("Isaac Asimov", "The Galaxy");
            System.out.println(book.getAuthor() + " " + book.getTitle());
        }
    }