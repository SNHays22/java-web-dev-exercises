package RestaurantMenu;

public class MenuItem {
    private String item;
    private String description;
    private String category;
    private double price;
    private boolean isNewItem;

    private int dateItemAdded;

    public MenuItem(String item, String description, String category, double price, boolean isNewItem, int dateItemAdded) {
        this.item = item;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNewItem = isNewItem;
        this.dateItemAdded = dateItemAdded;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNewItem() {
        return isNewItem;
    }

    public void setNewItem(boolean newItem) {
        isNewItem = newItem;
    }

    public int getDateItemAdded() {
        return dateItemAdded;
    }

    public void setDateItemAdded(int dateItemAdded) {
        this.dateItemAdded = dateItemAdded;
    }

    //public static void addItem(String item, String description, String category, double price, boolean isNewItem, int dateItemAdded) {
        //if
    //}

   // public addItem(String)

    //verify if item is new - print message about updating menu
    //compare when menu was updated to if item is new -
    //  if within say 30 days don't print full menu maybe only print new item menus
}

