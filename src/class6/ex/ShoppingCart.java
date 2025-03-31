package class6.ex;

public class ShoppingCart {
    private Item[] newItems = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if(itemCount>= newItems.length){
            System.out.println("장바구니가 가득 찼습니다.");
        }
        newItems[itemCount] = item;
        itemCount++;
    }
    public void displayItems() throws NullPointerException{
        System.out.println("장바구니 상품 출력");
        for(Item item: newItems) {
            if(item != null) {
            System.out.println("상품명: " + item.getItemName() + " 합계 : " + item.getTotalPrice());
            }else{
                break;
            }
        }
        System.out.println("전체 합: " + calculateTotalPrice());
    }
    private int calculateTotalPrice(){
        int totalPrice = 0;
        for(int i = 0; i < itemCount; i++){
            Item item = newItems[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

}
