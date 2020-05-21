import java.util.List;

public class PublishingCompany {

    private String name;
    private List<Author> authors;

    public PublishingCompany(String name, List<Author> authors) {
        this.name = name;
        this.authors = authors;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}