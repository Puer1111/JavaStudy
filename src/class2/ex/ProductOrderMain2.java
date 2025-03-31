package class2.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
//        ProductOrder order1 = createOrder("김치" , 1000, 3);
//        ProductOrder order2 = createOrder("배추" , 3000, 5);
//        ProductOrder[] orderArray= {order1,order2};
        ProductOrder[] orders = new ProductOrder[2];
        orders[0] = createOrder("김치" , 1000, 3);
        orders[1] = createOrder("배추" , 3000, 5);
        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 가격 : " + totalAmount);
        }

        static ProductOrder createOrder(String productName, int price, int quantity) {
            ProductOrder po = new ProductOrder();
            po.productName = productName;
            po.price = price;
            po.quantity = quantity;
            return po;
        }

        static void printOrders(ProductOrder[] orders){
            for(ProductOrder order : orders) {
                System.out.println("상품명: " + order.productName + " 가격: " + order.price + " 개수 " + order.quantity);
            }
        }
        static int getTotalAmount(ProductOrder[] orders){
            int totalAmount = 0;
                for(ProductOrder order : orders) {
                    totalAmount += order.price * order.quantity;
                }
                return totalAmount;
            }
    }

