package lesson23_20022019_thread.p3;

public class MainStore {


    public static void main(String[] args) {

        Store store = new Store();

        new Producer(store);
        new Consumer(store);
    }
}
