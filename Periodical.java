public class Periodical extends LibraryItem {

    private String issueDate;
    private String newIssue;
    private PublishingCompany publisher;

    public Periodical(String title, long yearReleased, long id, double costLostDamaged, String returnDate,
            double lateFee, boolean checkedOut, String genre, String issueDate, String newIssue,
            PublishingCompany publisher) {
        super(title, yearReleased, id, costLostDamaged, returnDate, lateFee, checkedOut, genre);
        this.issueDate = issueDate;
        this.newIssue = newIssue;
        this.publisher = publisher;
    }

    // Getters

    public String getIssueDate() {
        return issueDate;
    }

    public String getNewIssue() {
        return newIssue;
    }

    public PublishingCompany getPublishingCompany(){
        return this.publisher;
    }

    // Setters

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setNewIssue(String newIssue) {
        this.newIssue = newIssue;
    }

    public void setPublishingCompany(PublishingCompany publisher){
        this.publisher = publisher;
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