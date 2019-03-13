package lessons.lesson24.p4;

public class MainStore {


    public static void main(String[] args) {

        Store store = new Store();

        new Producer(store);
        new Consumer(store);
    }
}
