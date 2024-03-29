package main.java.LibrarySystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySystemUI {

    private static final LibrarySystem.LibrarySystem librarySystem = new LibrarySystem.LibrarySystem();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the library system!");

        while (true) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Add a book");
            System.out.println("2. Add a student user");
            System.out.println("3. Add a faculty member user");
            System.out.println("4. Borrow a book");
            System.out.println("5. Extend a lending");
            System.out.println("6. Return a book");
            System.out.println("7. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    addStudentUser();
                    break;
                case 3:
                    addFacultyMemberUser();
                    break;
                case 4:
                    borrowBook();
                    break;
                case 5:
                    // Get user input for student name, book title, and new due date
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter new due date (yyyy-mm-dd): ");
                    LocalDate newDueDate = LocalDate.parse(scanner.nextLine());

                    // Find the student and book objects using the library system
                    LibrarySystem.Student student = (LibrarySystem.Student) librarySystem.findUserByName(studentName);
                    Book book = librarySystem.findBookByTitle(bookTitle);

                    // Call the extendLending() method with the required parameters
                    librarySystem.extendLending(student, book, newDueDate);
                    break;
                case 6:
                    // Get user input for user name and book title
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    System.out.print("Enter book title: ");
                    bookTitle = scanner.nextLine();

                    // Find the user and book objects using the library system
                    LibrarySystem.User user = librarySystem.findUserByName(userName);
                    book = librarySystem.findBookByTitle(bookTitle);

                    // Call the returnBook() method with the required parameters
                    librarySystem.returnBook(user, book);
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addBook() {
        System.out.println("\nEnter the book title:");
        String title = scanner.nextLine();

        System.out.println("Enter the number of authors:");
        int numAuthors = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        List<LibrarySystem.Author> authors = new ArrayList<>();
        for (int i = 0; i < numAuthors; i++) {
            System.out.println("Enter author " + (i + 1) + "'s name:");
            String authorName = scanner.nextLine();
            authors.add(new LibrarySystem.Author(authorName));
        }

        librarySystem.addBookWithTitleAndAuthorlist(title, authors);
        System.out.println("\nBook added successfully!");
    }

    private static void addStudentUser() {
        System.out.println("\nEnter the student's name:");
        String name = scanner.nextLine();

        System.out.println("Has the student paid their fees? (y/n)");
        boolean feePaid = scanner.nextLine().equalsIgnoreCase("y");

        librarySystem.addStudentUser(name, feePaid);
        System.out.println("\nStudent added successfully!");
    }

    private static void addFacultyMemberUser() {
        System.out.println("\nEnter the faculty member's name:");
        String name = scanner.nextLine();

        System.out.println("Enter the faculty member's department:");
        String department = scanner.nextLine();

        librarySystem.addFacultyMemberUser(name, department);
        System.out.println("\nFaculty member added successfully!");
    }

    private static void borrowBook() {
        System.out.println("\nEnter the borrower's name:");
        String borrowerName = scanner.nextLine();
        LibrarySystem.User borrower = librarySystem.findUserByName(borrowerName);

        if (borrower == null) {
            System.out.println("User not found. Please try again.");
            return;
        }

        System.out.println("Enter the book title:");
        String bookTitle = scanner.nextLine();
        Book book = librarySystem.findBookByTitle(bookTitle);

        if (book == null) {
            System.out.println("Book not found. Please try again.");
            return;
        }

        librarySystem.borrowBook(borrower, book);
        System.out.println("\nBook borrowed successfully!");
    }
}


