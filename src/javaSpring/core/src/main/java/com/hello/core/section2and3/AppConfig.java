package com.hello.core.section2and3;

import com.hello.core.section2and3.discount.DiscountPolicy;
import com.hello.core.section2and3.discount.FixdiscountPolicy;
import com.hello.core.section2and3.discount.RateDiscountPolicy;
import com.hello.core.section2and3.member.MemberRepository;
import com.hello.core.section2and3.member.MemberService;
import com.hello.core.section2and3.member.MemberServiceImpl;
import com.hello.core.section2and3.member.MemoryMemberRepository;
import com.hello.core.section2and3.order.OrderService;
import com.hello.core.section2and3.order.OrderServiceImpl;

public class AppConfig {


    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(),discountPolicy());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    public DiscountPolicy discountPolicy() {
//        return new FixdiscountPolicy();
        return new RateDiscountPolicy();
    }
}
