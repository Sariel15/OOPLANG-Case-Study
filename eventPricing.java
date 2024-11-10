public class eventPricing extends Pricing{
    private int event;
    private double discount;

    public void setEvent(int event){
        this.event = event;
    }
    
    public double getDiscount(){
        if (event == 1){
            discount = 0.08;
        }
        else if (event == 2){
            discount = 0.12;
        }
        else if (event == 3){
            discount = 0.00;    
        }
        else if (event == 4){
            discount = 0.1;
        }
        else if (event == 5){
            discount = 0.15;
        }
        return discount;
    }
}
