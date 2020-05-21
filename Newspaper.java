public class Newspaper extends Periodical {

    private String publisher;

    public Newspaper(String title, long yearReleased, long id, double costLostDamaged, String returnDate,
            double lateFee, boolean checkedOut, String genre, String issueDate, String newIssue, String publisher) {
        super(title, yearReleased, id, costLostDamaged, returnDate, lateFee, checkedOut, genre, issueDate, newIssue);
        this.publisher = publisher;

    }

    @Override
    public boolean isCheckedOut() {
        if (getCheckedOut()) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Identification number: " + String.valueOf(this.getId()) + " \n Title: " + this.getTitle() + " \n Year: "
                + String.valueOf(this.getYearReleased());
    }
}