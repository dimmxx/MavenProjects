package lesson24.p4;

import java.util.concurrent.Semaphore;

public class MainStore {


    public static void main(String[] args) {

        Store store = new Store();

        new Producer(store);
        new Consumer(store);
    }
}
