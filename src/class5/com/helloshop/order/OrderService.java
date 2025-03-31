package class5.com.helloshop.order;

import class5.com.helloshop.product.Product;
import class5.com.helloshop.user.User;

public class OrderService {
    public void Order(){
        User user = new User();
        Product product = new Product();
        Order order = new Order(user,product);

    }
}
