package javaBasic.class6.ex;

public class Item {
    private String itemName;
    private int price;
    private int quantity;

    public Item(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() {
        return itemName;
    }

    public int  getTotalPrice() {
        return price * quantity;
    }

}
