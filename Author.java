public class Author {

    private String name;
    private String publisher;

    public Author(String name, String publisher) {
        this.name = name;
        this.publisher = publisher;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getPublisher() {
        return this.publisher;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
