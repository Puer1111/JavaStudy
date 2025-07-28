package com.hello.core.order;

import com.hello.core.section2and3.AppConfig;
import com.hello.core.section2and3.member.Grade;
import com.hello.core.section2and3.member.Member;
import com.hello.core.section2and3.member.MemberService;
import com.hello.core.section2and3.member.MemberServiceImpl;
import com.hello.core.section2and3.order.Order;
import com.hello.core.section2and3.order.OrderService;
import com.hello.core.section2and3.order.OrderServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    //    MemberService memberService = new MemberServiceImpl();
//    OrderService orderService = new OrderServiceImpl();
    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void init() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);


        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertEquals(1000, order.getDiscountPrice());
    }

}
