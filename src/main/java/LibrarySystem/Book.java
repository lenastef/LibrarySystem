package main.java.LibrarySystem;

import java.util.List;


public class Book {
    private String title;
    private List<LibrarySystem.Author> authors;
    private int numAvailableCopies;
    Book newBook = new Book(title, authors, numAvailableCopies);


    public Book(String title, List<LibrarySystem.Author> authors, int numAvailableCopies) {
        this.title = title;
        this.authors = authors;
        this.numAvailableCopies = numAvailableCopies;
    }

    public void addAuthor(LibrarySystem.Author author) {
        this.authors.add(author);
    }

    public List<LibrarySystem.Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<LibrarySystem.Author> authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumAvailableCopies() {
        return numAvailableCopies;
    }

    public void setNumAvailableCopies(int numAvailableCopies) {
        this.numAvailableCopies = numAvailableCopies;
    }
}
