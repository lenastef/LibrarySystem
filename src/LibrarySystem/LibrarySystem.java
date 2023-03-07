package LibrarySystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {

    private final List<Lending> lendings = new ArrayList<>();

    public LibrarySystem() {

    }

    public void addBookWithTitleAndAuthorlist(String title, List<Author> authors) {

    }


    public void addStudentUser(String name, boolean feePaid) {

    }

    public void addFacultyMemberUser(String name, String department) {

    }

    public void findBookByTitle(String title, List<Author> authors) {
        return;
    }

    public void findSUserByName(String name) {
        return;

    }

    public void borrowBook(User user, Book book) {

    }

    public void extendLending(Student student, Book book, LocalDate NewDueDate) {

    }

    public void returnBook(User user, Book book) {

    }

    public void UserOrBookDoesNotExistException(String message) {
    }
}
