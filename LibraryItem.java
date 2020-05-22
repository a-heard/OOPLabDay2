public abstract class LibraryItem {
    private int numOfComputers;
    private int numOfWorkspaces;

    public LibraryItem() {
        this.numOfComputers = 10;
    }

    public LibraryItem(int numOfComputers, int numOfWorkspaces) {
        this.numOfComputers = numOfComputers;
        this.numOfWorkspaces = numOfWorkspaces;
    }
}