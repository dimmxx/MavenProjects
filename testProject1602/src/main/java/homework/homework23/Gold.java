package homework.homework23;

public class Gold {

    int quantity;

    public Gold(int quantity) {
        this.quantity = quantity;
    }

    synchronized public void mineGold(){
        quantity -= 3;
    }




}
