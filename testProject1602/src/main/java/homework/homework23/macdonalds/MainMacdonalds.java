package homework.homework23.macdonalds;

public class MainMacdonalds {

    public static void main(String[] args) {

        CashBox cashBox = new CashBox(3000);

        int quantity = (int)(Math.random()*5) + 1;
        System.out.println("The  number of customers in queue: " + quantity);

        for (int i = 0; i < quantity; i++){
            new Customer(cashBox, "Customer#" + i);
        }
    }

}
