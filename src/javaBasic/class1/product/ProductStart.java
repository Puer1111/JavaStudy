package javaBasic.class1.product;

import java.util.Scanner;

public class ProductStart {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product1 = new Product();
        product1.productName = sc.nextLine();
        product1.price = sc.nextInt();
        product1.quantity = sc.nextInt();

        Product product2 = new Product();
        product2.productName = sc.next();
        product2.price = sc.nextInt();
        product2.quantity = sc.nextInt();

        Product[] products = {product1,product2};
        for(Product product:products){
            System.out.println("상품 이름: " + product.productName + " 상품 가격: " +  product.price + " 상품 개수 : " +  product.quantity);
            System.out.println("상품 총 가격: " + product.price*product.quantity);
        }
    }
}
