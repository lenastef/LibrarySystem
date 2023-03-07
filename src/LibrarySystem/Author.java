package LibrarySystem;

public class Author extends Book {

    private String name;

    public Author(String title, String name) {
        super(title, authors);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
