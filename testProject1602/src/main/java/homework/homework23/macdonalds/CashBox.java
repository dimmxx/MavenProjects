package homework.homework23.macdonalds;

public class CashBox {

    private int time;
    volatile private boolean vacant = true;
    private int counter;

    public CashBox(int time) {
        this.time = time;
    }

    synchronized public void serve(Customer customer){

        boolean lastClient;
        if ((int)(Math.random()*10) % 2 == 0){
            lastClient = true;
            System.out.println("Serving the last customer");
        } else lastClient = false;

        if (vacant) {
                vacant = false;
                counter++;
                System.out.println(" ...serving " + customer.getName());
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("finished with " + customer.getName() + ". Customers served: " + counter + "\n");

                if(lastClient){
                    System.exit(0);
                }

                vacant = true;
                notify();

            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
