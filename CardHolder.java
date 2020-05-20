public class CardHolder {
    private String name;
    private String gender;
    private int age;
    private long id;

    public CardHolder(String name, String gender, int age, long id) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
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
}