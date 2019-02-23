package homework.homework23.macdonalds;

public class Customer implements Runnable{

    private CashBox cashBox;
    private String name;

    public Customer(CashBox cashBox, String name) {
        this.cashBox = cashBox;
        this.name = name;
        new Thread(this).start();
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        cashBox.serve(this);

    }
}
