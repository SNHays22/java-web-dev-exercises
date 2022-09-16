package inheritance;

import java.util.concurrent.ThreadLocalRandom;

public class AbstractClass {
    private int id;

    public AbstractClass(){
        this.id = ThreadLocalRandom.current().nextInt(8, 100+1);
    }

    public int getId() {
        return id;
    }
}
