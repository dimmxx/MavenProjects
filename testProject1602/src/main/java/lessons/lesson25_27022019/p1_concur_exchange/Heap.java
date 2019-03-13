package lessons.lesson25_27022019.p1_concur_exchange;

public class Heap {

    private String name;
    private int quantity;
    private int startQuantity;

    public Heap(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.startQuantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getStartQuantity() {
        return startQuantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
