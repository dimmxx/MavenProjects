package homework.homework24;

public class Heap1 {

    private int weight;
    private int shovel;
    private String name;

    public Heap1(int weight, int shovel) {
        this.name = "Heap1";
        this.weight = weight;
        this.shovel = shovel;
    }

    public int getWeight() {
        return weight;
    }

    public int getShovel() {
        return shovel;
    }

    protected int takeCoal(){
        printHeap(weight);
        System.out.println("\n" + name + ": Starting shipment ...");
        if(weight >= shovel){
            weight -= shovel;
            System.out.println(name + ": Loaded " + shovel + " kg");
            printHeap(weight - shovel);
            return shovel;
        }else{
            System.out.println(name + ": Loaded " + weight + " kg");
            printHeap(weight - weight);
            int swap = weight;
            weight = 0;
            return swap;
        }
    }

    private void printHeap(int quantity){
        System.out.print(name + " : ");
        for (int i = 0; i < quantity; i++){
            System.out.print("|");
        }
        System.out.print(" : " + quantity + " kg");

    }





}
