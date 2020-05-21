public class Magazine extends Periodical implements Reservable, Loanable {

    public Magazine(String title, long yearReleased, long id, double costLostDamaged, String returnDate, double lateFee,
            boolean checkedOut, String issueDate, String newIssue, String genre, PublishingCompany publisher) {
        super(title, yearReleased, id, costLostDamaged, returnDate, lateFee, checkedOut, issueDate, newIssue, genre,
                publisher);

    }

    @Override
    public boolean isCheckedOut() {
        if (getCheckedOut()) {
            return true;
        } else {
            return false;
        }
    }

    // Implementing methods from IReserveable
    @Override
    public boolean isReservable() {
        return false;
    }

    // Implementing methods from ILoanable
    @Override
    public boolean isLoanable() {
        return false;
    }

    public String toString() {
        return "Identification number: " + String.valueOf(this.getId()) + " \n Title: " + this.getTitle() + " \n Year: "
                + String.valueOf(this.getYearReleased());
    }

}