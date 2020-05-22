public class Author{
    
    private String name;
    private int numOfBooksWritten;

    Author(String name, int numOfBooksWritten) {
        this.name = name;
        this.numOfBooksWritten = numOfBooksWritten;
    }
    // Getters
    public String getName() {
        return name;
    }
    public int getNumOfBooksWritten() {
        return numOfBooksWritten;
    }
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setNumOfBooksWritten(int numOfBooksWritten) {
        this.numOfBooksWritten = numOfBooksWritten;
    }
    
    @Override
    public String toString(){
        return this.name + " has written " + this.numOfBooksWritten + "books.";
    }
}