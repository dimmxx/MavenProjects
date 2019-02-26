package homework.homework24;

public class Heap {

    private int weight;
    private int shovel;
    private String name;

    public Heap(String name, int weight, int shovel) {
        this.name = name;
        this.weight = weight;
        this.shovel = shovel;
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
            return shovel;
        }else{
            System.out.println(name + ": Sent " + weight);
            printHeap(weight - weight);
            int swap = weight;
            weight = 0;
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
