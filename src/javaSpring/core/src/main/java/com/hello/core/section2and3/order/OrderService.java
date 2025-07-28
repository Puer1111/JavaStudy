package com.hello.core.section2and3.order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
