public class LibraryItem {

    // Class properties
    private String title;
    private long yearReleased;
    private long id;
    private double costLostDamaged;
    private String returnDate;
    private double lateFee;
    private boolean checkedOut;

    // Constructor
    public LibraryItem(String title, long yearReleased, long id, double costLostDamaged, String returnDate,
            double lateFee, boolean checkedOut) {

        this.title = title;
        this.yearReleased = yearReleased;
        this.id = id;
        this.costLostDamaged = costLostDamaged;
        this.returnDate = returnDate;
        this.lateFee = lateFee;
        this.checkedOut = checkedOut;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public long getYearReleased() {
        return yearReleased;
    }

    public long getId() {
        return id;
    }

    public double getCostLostDamaged() {
        return costLostDamaged;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public double getLateFee() {
        return lateFee;
    }

    public boolean getCheckedOut() {
        return checkedOut;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearReleased(long yearReleased) {
        this.yearReleased = yearReleased;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCostLostDamaged(double costLostDamaged) {
        this.costLostDamaged = costLostDamaged;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public boolean isCheckedOut(boolean checkedOut) {
        return getCheckedOut();
    }

    @Override
    public String toString() {
        return "Identification number: " + String.valueOf(this.getId()) + " \n Title: " + this.title + " \n Year: "
                + String.valueOf(this.yearReleased);
    }

}