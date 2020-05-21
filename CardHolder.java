import java.util.List;

public class CardHolder {
    private String name;
    private String gender;
    private int age;
    private long id;
    private List<Book> books;
    private List<Periodical> periodicals;

    public CardHolder(String name, String gender, int age, long id, List<Book> books, List<Periodical> periodicals) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.books = books;
        this.periodicals = periodicals;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public long getId() {
        return this.id;
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public List<Periodical> getPeriodicals() {
        return this.periodicals;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(long id) {
        this.id = id;
    }

    // methods
    public void checkOutItem() {

    }

    public void reserveItem() {

    }
}