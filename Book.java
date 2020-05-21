public class Book extends LibraryItem {

    private long numOfPages;
    private Author author;

    public Book(String title, long yearReleased, long id, double costLostDamaged, String returnDate, double lateFee,
            boolean checkedOut, long numOfPages, Author author, String genre) {
        super(title, yearReleased, id, costLostDamaged, returnDate, lateFee, checkedOut, genre);
        this.numOfPages = numOfPages;
        this.author = author;
    }

    // Getters

    public long getNumOfPages() {
        return numOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    // Setters

    public void setNumOfPages(long numOfPages) {
        this.numOfPages = numOfPages;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    // Methods
    @Override
    public boolean isCheckedOut() {
        if (getCheckedOut()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Identification number: " + String.valueOf(this.getId()) + " \n Title: " + this.getTitle() + " \n Year: "
                + String.valueOf(this.getYearReleased());
    }
}