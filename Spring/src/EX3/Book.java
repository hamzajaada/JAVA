package EX3;

public class Book {
    private String title, author;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "Book: " + title + " by " + author;
    }
}
