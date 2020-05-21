import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Hello! Type in one of the following categories to begin: BOOK, PERIODICAL, GENERAL_BOOK, REFERENCE_BOOK, MAGAZINE, NEWSPAPER");
        String userInput = scanner.nextLine();

        LibraryItem book1 = LibraryFactory.CreateLibraryItemString(userInput);
        book1.setTitle("Moby Dick");
        book1.setIsCheckedOut(false);
        book1.setId(1);

        System.out.println(book1);
    }
}