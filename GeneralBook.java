public class GeneralBook extends Book {

    public GeneralBook(String title, long yearReleased, long id, double costLostDamaged, String returnDate,
            double lateFee, boolean checkedOut, long numOfPages, String author, String genre) {
        super(title, yearReleased, id, costLostDamaged, returnDate, lateFee, checkedOut, numOfPages, author, genre);
    }

    // Methods
    @Override
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