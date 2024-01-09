package EX3;

import java.util.List;

public class Library {
     private List<Book> books;
    private List<Reader> readers;

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    public void printBooks() {
        books.forEach(System.out::println);
    }

    public void printReaders() {
        readers.forEach(System.out::println);
    }

    public String toString() {
        return "Library{" +
                "books=" + books +
                ", readers=" + readers +
                "}";
    }
}
