public class GeneralBook extends Book implements Reservable, Loanable {

    public GeneralBook(String title, long yearReleased, long id, double costLostDamaged, String returnDate,
            double lateFee, boolean checkedOut, long numOfPages, String author, String genre) {
        super(title, yearReleased, id, costLostDamaged, returnDate, lateFee, checkedOut, numOfPages, author, genre);
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

    // Implementing methods from IReserveable
    @Override
    public boolean isReservable() {
        return true;
    }

    // Implementing methods from ILoanable
    @Override
    public boolean isLoanable() {
        if (this.getCheckedOut()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Identification number: " + String.valueOf(this.getId()) + " \n Title: " + this.getTitle() + " \n Year: "
                + String.valueOf(this.getYearReleased());
    }
}