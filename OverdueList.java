public class OverdueList<E extends CardHolder> {

    private E someCardholder;

    public OverdueList(E someCardholder) {
        this.someCardholder = someCardholder;
    }

    public E getSomeCardholder() {
        return someCardholder;
    }

}