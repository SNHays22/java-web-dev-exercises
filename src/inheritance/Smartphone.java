package inheritance;

import java.util.HashMap;

public class Smartphone extends Computer {

    private HashMap<String, String> contactBook;

    public Smartphone(int storage, int CPU, boolean hasPhysicalKeyboard){
        super(storage, CPU, hasPhysicalKeyboard);
    }

    public void addContact(String name, String phoneNumber){
        contactBook.put(name, phoneNumber);
    }
}
