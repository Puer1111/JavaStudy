package javaBasic.class5.com.helloshop.order;

import javaBasic.class5.com.helloshop.product.Product;
import javaBasic.class5.com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    public Order() {

    }
}
