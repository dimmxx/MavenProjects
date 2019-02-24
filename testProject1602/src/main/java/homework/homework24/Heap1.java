package homework.homework24;

public class Heap1 {

    private int weight;
    private int shovel;

    public Heap1() {
        this.weight = 100;
        this.shovel =3;
    }

    public int getWeight() {
        return weight;
    }

    public int getShovel() {
        return shovel;
    }

    protected int takeCoal(){
        printHeap(weight);
        System.out.println("\nStarting loading ...");
        if(weight >= shovel){
            weight -= shovel;
            System.out.println("Loaded " + shovel + " kg");
            printHeap(weight - shovel);
            return shovel;
        }else{
            System.out.println("Loaded " + weight + " kg");
            printHeap(weight - weight);
            int swap = weight;
            weight = 0;
            return swap;
        }
    }

    private void printHeap(int quantity){
        System.out.print("Heap1: ");
        for (int i = 0; i < quantity; i++){
            System.out.print("|");
        }
        System.out.print(" : " + quantity + " kg");

    }





}
