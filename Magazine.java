public class Magazine extends Periodical {

    public Magazine(String title, long yearReleased, long id, double costLostDamaged, String returnDate, double lateFee,
            boolean checkedOut, String issueDate, String newIssue, String genre) {
        super(title, yearReleased, id, costLostDamaged, returnDate, lateFee, checkedOut, issueDate, newIssue, genre);

    }

    public boolean isCheckedOut(boolean checkedOut) {
        if (checkedOut) {
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