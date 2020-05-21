public class Magazine extends Periodical implements Reservable, Loanable {

    public Magazine() {

    }

    public Magazine(String title, long yearReleased, long id, double costLostDamaged, String returnDate, double lateFee,
            boolean isCheckedOut, String issueDate, String newIssue, String genre, PublishingCompany publisher) {
        super(title, yearReleased, id, costLostDamaged, returnDate, lateFee, isCheckedOut, issueDate, newIssue, genre,
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