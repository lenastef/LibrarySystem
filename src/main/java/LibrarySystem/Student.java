package main.java.LibrarySystem;

public class Student extends LibrarySystem.User {
    private boolean feePaid;

    public boolean isFeePaid() {
        return feePaid;
    }

    public void setFeePaid(boolean feePaid) {
        this.feePaid = feePaid;
    }

    public Student(String name, boolean feePaid) {
        super(name);
        this.feePaid = feePaid;
    }
}
