package inheritance;

public class Laptop extends Computer{

    private int weight;

    public Laptop (int storage, int CPU, boolean hasPhysicalKeyboard, int weight){
        super(storage, CPU, hasPhysicalKeyboard);
        this.weight = weight;
    }


}
