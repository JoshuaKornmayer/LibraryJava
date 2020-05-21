public class Book extends LibraryItem {

    private long numOfPages;
    private Author author;
    private LateChargeType lateCharge;

    public Book(String title, long yearReleased, long id, double costLostDamaged, String returnDate, double lateFee,
            boolean checkedOut, long numOfPages, Author author, String genre, LateChargeType lateCharge) {
        super(title, yearReleased, id, costLostDamaged, returnDate, lateFee, checkedOut, genre);
        this.numOfPages = numOfPages;
        this.author = author;
        this.lateCharge = lateCharge;
    }

    // Getters

    public long getNumOfPages() {
        return numOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public LateChargeType getLateCharge() {
        return this.lateCharge;
    }

    // Setters

    public void setNumOfPages(long numOfPages) {
        this.numOfPages = numOfPages;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void lateChargeType(LateChargeType lateCharge) {
        this.lateCharge = lateCharge;
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