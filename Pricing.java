public class Pricing {
    private int PAX;
    private double rate, totalCost;
    

    public void setValues(int PAX, int rate){
        this.PAX = PAX;
        this.rate = rate;
    }

    public double getEventTotalPrice(){
        totalCost = rate * PAX;

        return totalCost;
    }
}
