package inheritance;

public class Computer extends AbstractClass {

    public Computer(int storage, int CPU, boolean hasPhysicalKeyboard){
        super();
        this.storage = storage;
        this.CPUClockSpeed = CPU;
        this.hasPhysicalKeyboard = hasPhysicalKeyboard;
    }

    private int storage;
    private int CPUClockSpeed;
    private boolean hasPhysicalKeyboard;

    public void increaseStorage(int amountIncreasing){
        this.storage = this.storage + amountIncreasing;
    }

    public int getStorage() {
        return storage;
    }

    public int getCPUClockSpeed() {
        return CPUClockSpeed;
    }

    public boolean isHasPhysicalKeyboard() {
        return hasPhysicalKeyboard;
    }


    //SmartPhone
      //keyboard = touchscreen
      //addContacts();


    //Laptop
      //weighty
      //keyboard = physical






}
