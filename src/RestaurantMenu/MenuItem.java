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
}
