package sandbox.p2_exchanger;

public class Item {

    private String name;
    private int age;

    public Item(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" + name + " " + age + "]";
    }
}
