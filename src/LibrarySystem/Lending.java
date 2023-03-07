package LibrarySystem;

import java.time.LocalDate;

public class Lending {

    private LocalDate duedate;
    private User user;
    private Book book;

    public Lending(Book book, User user) {
        this.duedate = LocalDate.now();
    }

    public String getDuedate() {
        return LocalDate.now().toString();
    }

    public void setDuedate(String duedate) {
        this.duedate = LocalDate.parse(duedate);
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

