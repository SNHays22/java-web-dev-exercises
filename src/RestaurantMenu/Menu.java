package RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;


public class Menu {

    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date lastUpdated, ArrayList<MenuItem> items) {
        this.lastUpdated = lastUpdated;
        this.items = items;
    }



}
//Calendar cal = Calendar.getInstance();
//System.out.println("Menu created on: " + cal.getTime())
// java.util.Calendar & java.text.*