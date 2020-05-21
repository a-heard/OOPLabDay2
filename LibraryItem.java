
public class LibraryItem {
     private int numberOfBooks;
        private String borrower;
        private boolean isAvailable, isOverDue;
    
        public LibraryItem(int numberOfBooks, String borrower, boolean isAvailable, boolean isOverDue) {
            this.numberOfBooks = numberOfBooks;
            this.borrower = borrower;
            this.isAvailable = isAvailable;
            this.isOverDue = isOverDue;
        }
    
        public int getNumberOfBooks() {
            return numberOfBooks;
        }
    
        public String getBorrower() {
            return borrower;
        }
    
        public boolean getIsAvailable() {
            return isAvailable;
        }
    
        public boolean getIsOverDue() {
            return isOverDue;
        }
    
        public void setNumberOfBooks(int numberOfBooks) {
            this.numberOfBooks = numberOfBooks;
        }
    
        public void setBorrower(String borrower) {
            this.borrower = borrower;
        }
    
        public void setIsAvailable(boolean isAvailable) {
            this.isAvailable = isAvailable;
        }
    
        public void setIsOverDue(boolean isOverDue) {
            this.isOverDue = isOverDue;
        }
}