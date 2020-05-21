public class GeneralBook extends Book implements Reservable, Loanable {

    public GeneralBook() {

    }

    public GeneralBook(String title, long yearReleased, long id, double costLostDamaged, String returnDate,
            double lateFee, boolean isCheckedOut, long numOfPages, Author author, String genre,
            LateChargeType lateCharge) {
        super(title, yearReleased, id, costLostDamaged, returnDate, lateFee, isCheckedOut, numOfPages, author, genre,
                lateCharge);
    }

    // Methods
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
        return true;
    }

    // Implementing methods from ILoanable
    @Override
    public boolean isLoanable() {
        if (this.getIsCheckedOut()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public double lateCharge() {
        return 50;
    }

    @Override
    public String toString() {
        return "Identification number: " + String.valueOf(this.getId()) + " \n Title: " + this.getTitle() + " \n Year: "
                + String.valueOf(this.getYearReleased()) + " \n Checked Out: " + isCheckedOut();
    }
}