# LibrarySystem

A project with a stupid car owner class that needs refactoring.
This project is a Maven project, i.e. it uses the standard Maven project structure that your IDE hopefully understands when you `git clone` it. The provided Maven POM includes the JUnit4 dependency.

Both the implementation and the tests are in Java package `is.hi.hbv202g.ass6`, 
but in the usual separate Maven `src` directories:

- `src/main/java`:
  A class representing cars, a class representing a person who owns a car, and a Main class with a main method.
  
- `src/test/java`:
  A Alltests test suite class, two classes containing test cases for the car and the car owner class.
Maven:

- `mvn compile` compiles all implementation classes.
- `mvn exec:java` executes the main method of the implementation.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends with `Test`, `Tests`, or `TestCase`).

