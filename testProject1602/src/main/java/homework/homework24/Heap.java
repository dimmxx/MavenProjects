package homework.homework24;

public class Heap {

    private int weight;
    private int shovel;
    private String name;
    private Monitor monitor;

    public Heap(String name, int weight, int shovel, Monitor monitor) {
        this.name = name;
        this.weight = weight;
        this.shovel = shovel;
        this.monitor = monitor;
    }

    public int getWeight() {
        return weight;
    }

    public int getShovel() {
        return shovel;
    }

    protected int giveCoal(){
        printHeap(weight);
        System.out.println("\n" + name + ": Starting shipment ...");
        if(weight >= shovel){
            weight -= shovel;
            System.out.println(name + ": Sent " + shovel);
            printHeap(weight);
            if(weight == 0) monitor.setHeapOneisEmpty(true);
            return shovel;
        }else{
            System.out.println(name + ": Sent " + weight);
            printHeap(weight - weight);
            int swap = weight;
            weight = 0;
            monitor.setHeapOneisEmpty(true);
            return swap;
        }

    }

    protected void getCoal(int weight){
        System.out.println("\n" + name + ": Starting receiving ...");
        printHeap(this.weight);
        this.weight += weight;
        System.out.println("\n" + name + ": Finished receiving ...");
        printHeap(this.weight);

    }

    private void printHeap(int quantity){
        System.out.print(name + ": ");
        for (int i = 0; i < quantity; i++){
            System.out.print("|");
        }
        System.out.print(": " + quantity);

    }





}
