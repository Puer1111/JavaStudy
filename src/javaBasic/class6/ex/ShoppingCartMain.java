package javaBasic.class6.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item = new Item("마늘" , 2000, 2);
        Item item2 = new Item("상추" , 4000, 3);
        Item item3 = new Item("배추" , 5000, 5);

        cart.addItem(item);
        cart.addItem(item2);
        cart.addItem(item3);

        cart.displayItems();
    }
}
