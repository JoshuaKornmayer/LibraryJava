public class Magazine extends Periodical {

    private String genre;

    public Magazine(String title, long yearReleased, long id, double costLostDamaged, String returnDate, double lateFee,
            boolean checkedOut, String issueDate, String newIssue, String genre) {
        super(title, yearReleased, id, costLostDamaged, returnDate, lateFee, checkedOut, issueDate, newIssue);

    }
}