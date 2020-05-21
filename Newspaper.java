public class Newspaper extends Periodical implements Reservable, Loanable {

    public Newspaper() {

    }

    public Newspaper(String title, long yearReleased, long id, double costLostDamaged, String returnDate,
            double lateFee, boolean isCheckedOut, String genre, String issueDate, String newIssue,
            PublishingCompany publisher) {
        super(title, yearReleased, id, costLostDamaged, returnDate, lateFee, isCheckedOut, genre, issueDate, newIssue,
                publisher);

    }

    @Override
    public boolean isCheckedOut() {
        if (getIsCheckedOut()) {
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

    @Override
    public double lateCharge() {
        return 0;
    }

    public String toString() {
        return "Identification number: " + String.valueOf(this.getId()) + " \n Title: " + this.getTitle() + " \n Year: "
                + String.valueOf(this.getYearReleased());
    }
}