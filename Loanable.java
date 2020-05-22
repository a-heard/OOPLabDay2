interface Loanable{

    boolean isLoanable();
    int lateFee();
    public enum lateFee {DAILY, WEEKLY, MONTHLY}
}