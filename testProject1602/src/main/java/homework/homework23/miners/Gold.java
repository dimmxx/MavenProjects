package homework.homework23.miners;

public class Gold {

    volatile private int quantity;


    public Gold(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    synchronized public int mineGold(){
        if (quantity >= 3) {
            quantity -= 3;
            return 3;
        } else{
            int temp = quantity;
            quantity = 0;
            return temp;
        }
    }




}
