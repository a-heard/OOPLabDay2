public class Cardholder {
    private String name;
    private String joinDate;
    private boolean ableToCheckout;
    private boolean goodStanding;

    public Cardholder(String name, String joinDate, boolean ableToCheckout, boolean goodStanding) {
        this.name = name;
        this.joinDate = joinDate;
        this.ableToCheckout = ableToCheckout;
        this.goodStanding = goodStanding;
    }
    // Getters
    public String getName() {
        return name;
    }
    public String getJoinDate() {
        return joinDate;
    }
    public boolean isAbleToCheckout() {
        return ableToCheckout;
    }
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }
    public void setAbleToCheckout(boolean ableToCheckout) {
        this.ableToCheckout = ableToCheckout;
    }
    public void setGoodStanding(boolean goodStanding) {
        this.goodStanding = goodStanding;
    }

}