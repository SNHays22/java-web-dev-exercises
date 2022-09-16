package inheritance;

public class Program {

    public static void main(String[] args) {

        Laptop myLaptop = new Laptop(2, 3, true, 5);
        Smartphone mySmartphone = new Smartphone(1, 3, false);

        System.out.println("My laptop has: " + myLaptop.getStorage() + " TB of storage and " + myLaptop.getCPUClockSpeed() + "ghz of CPU and it has a physical keyboard: " + myLaptop.isHasPhysicalKeyboard());
        System.out.println("My smartphone has: " + mySmartphone.getStorage() + " TB of storage and " + mySmartphone.getCPUClockSpeed() + " ghz of CPU");


    }
}
