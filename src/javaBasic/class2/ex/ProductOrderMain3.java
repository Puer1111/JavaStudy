package javaBasic.class2.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수 입력: " );
        int n = sc.nextInt(); // 정수의 경우 숫자 입력 후 엔터시 줄바꿈을 인식해서 다음에 String 입력 시 nextLine 이 필요하다
        sc.nextLine();

        ProductOrder[] orders = new ProductOrder[n];
        for(int i = 0; i < n; i++){
            System.out.println((i+1) + "번째 주문 정보를 입력하세요");

            System.out.print("상품명: ");
            String productName = sc.nextLine();

            System.out.print("가격: ");
            int price = sc.nextInt();

            System.out.print("개수: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }
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

