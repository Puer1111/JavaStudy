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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixdiscountPolicy();
        return new RateDiscountPolicy();
    }
}
