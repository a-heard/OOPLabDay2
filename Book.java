import java.time.LocalDate; 

public class Book extends LibraryItem implements Reservable, Loanable{
    private String title, author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

        //Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

        //Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return this.getTitle() + " by " + this.getAuthor() + " published " + this.yearPublished;
    }

    // Implementing from Reservable
    @Override
    public boolean availableToReserve() {
        return true;
    }
    @Override
    public int allotedDaysToReserve() {
        return 3;
    }
    @Override
    public LocalDate dayReserved() {
         return LocalDate.now(); 
    }
    // Implementing from Loanable
    @Override
    public boolean isLoanable() {
        return true;
    }

    @Override
    public int lateFee() {
        // TODO Auto-generated method stub
        return 0;
    }
}