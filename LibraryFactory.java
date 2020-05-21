public class LibraryFactory {

    public static LibraryItem CreateLibraryItem(LibraryNames name) {
        LibraryItem l = null;

        if (name == null) {
            return null;
        }

        switch (name) {
            case BOOK:
                l = new Book();
                break;
            case PERIODICAL:
                l = new Periodical();
                break;
            case GENERAL_BOOK:
                l = new GeneralBook();
                break;
            case REFERENCE_BOOK:
                l = new ReferenceBook();
                break;
            case MAGAZINE:
                l = new Magazine();
                break;
            case NEWSPAPER:
                l = new Newspaper();
            default:
        }

        return l;
    }

    public static LibraryItem CreateLibraryItemString(String name) {
        LibraryItem l = null;

        if (name == null) {
            return null;
        }

        switch (name) {
            case "BOOK":
                l = new Book();
                break;
            case "PERIODICAL":
                l = new Periodical();
                break;
            case "GENERAL_BOOK":
                l = new GeneralBook();
                break;
            case "REFERENCE_BOOK":
                l = new ReferenceBook();
                break;
            case "MAGAZINE":
                l = new Magazine();
                break;
            case "NEWSPAPER":
                l = new Newspaper();
            default:
        }

        return l;
    }
}