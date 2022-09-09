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


    //getters & setters
    public Date getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public ArrayList<MenuItem> getItems() {
        return items;
    }
    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }


    @Override
    public String toString(){
        String myString = "";
        for(MenuItem item : this.items){
            myString += item.getItem() + ": " + item.getPrice() + "\n";
        }
        return myString;
    }
    //methods
    public ArrayList<MenuItem> addItem(MenuItem item){
        this.items.add(item);
        return this.items;
    }

    public ArrayList<MenuItem> removeItem(MenuItem item){
        int toBeRemoved = -1;

        for(int i=0; i<items.size(); i++){
            if(items.get(i).equals(item)){
                toBeRemoved = i;
            }
        }
        this.items.remove(toBeRemoved);
        return this.items;
    }

}
//Calendar cal = Calendar.getInstance();
//System.out.println("Menu created on: " + cal.getTime())
// java.util.Calendar & java.text.*