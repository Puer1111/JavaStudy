package com.hello.core;

import com.hello.core.section2and3.AppConfig;
import com.hello.core.section2and3.member.Grade;
import com.hello.core.section2and3.member.Member;
import com.hello.core.section2and3.member.MemberService;
import com.hello.core.section2and3.member.MemberServiceImpl;
import com.hello.core.section2and3.order.Order;
import com.hello.core.section2and3.order.OrderService;
import com.hello.core.section2and3.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
//        MemberService memberService = new MemberServiceImpl();
//        OrderService orderService = new OrderServiceImpl();

        AppConfig config = new AppConfig();
        MemberService memberService = config.memberService();
        OrderService orderService = config.orderService();
        Long MemberId = 1L;
        Member member = new Member(MemberId,"memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(MemberId,"itemA",15000);
        System.out.println(order);
        System.out.println(order.calculatePrice());
    }
}
