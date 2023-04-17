# LibrarySystem

Function: The system is divided into administrator interface and user interface

Administrator: Realize adding, deleting, modifying and checking books, searching all borrowing history and all account
information, user authority and management, setting passwords, borrowing books and modifying the data of one's own
account

User: Realize the function of borrowing books, check your own borrowing history, realize the functions of changing
password and modifying personal information in user account

Both the implementation and the tests are in Java package `HBV/LibrarySystem/src`,
but in the usual separate Maven `src` directories:

- `src/main/java`:
  A class representing cars, a class representing a person who owns a car, and a Main class with a main method.

- `src/test/java`:
  A Alltests test suite class, two classes containing test cases for the car and the car owner class.
  Maven:

- `mvn compile` compiles all implementation classes.
- `mvn exec:java` executes the main method of the implementation.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends
  with `Test`, `Tests`, or `TestCase`).

