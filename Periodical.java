public class Periodical extends LibraryItem {

    private String issueDate;
    private String newIssue;

    public Periodical(String title, long yearReleased, long id, double costLostDamaged, String returnDate,
            double lateFee, boolean checkedOut, String issueDate, String newIssue) {
        super(title, yearReleased, id, costLostDamaged, returnDate, lateFee, checkedOut);
        this.issueDate = issueDate;
        this.newIssue = newIssue;
    }

    // Getters

    public String getIssueDate() {
        return issueDate;
    }

    public String getNewIssue() {
        return newIssue;
    }

    // Setters

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setNewIssue(String newIssue) {
        this.newIssue = newIssue;
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