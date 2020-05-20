public class Book extends LibraryItem {

    private long numOfPages;
    private String author;

    public Book(String title, long yearReleased, long id, double costLostDamaged, String returnDate, double lateFee,
            boolean checkedOut, long numOfPages, String author) {
        super(title, yearReleased, id, costLostDamaged, returnDate, lateFee, checkedOut);
    }

    // Getters

    public long getNumOfPages() {
        return numOfPages;
    }

    public String getAuthor() {
        return author;
    }

    // Setters

    public void setNumOfPages(long numOfPages) {
        this.numOfPages = numOfPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Methods
    public boolean isCheckedOut(boolean checkedOut) {
        if (checkedOut) {
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