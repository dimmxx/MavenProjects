package lessons.lesson25_27022019.p1_concur_exchange;

public class Cart {

    private String name;
    private int maxCapacity;
    private int capacity;
    private int speed;

    public Cart() {
        this.name = "Cart";
        this.capacity = 0;
        this.maxCapacity = 6;
        this.speed = 5;
    }

    public String getName() {
        return name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", maxCapacity=" + maxCapacity +
                ", capacity=" + capacity +
                ", speed=" + speed +
                '}';
    }
}
