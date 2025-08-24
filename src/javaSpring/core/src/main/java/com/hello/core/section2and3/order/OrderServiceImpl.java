package com.hello.core.section2and3.order;

import com.hello.core.section2and3.discount.DiscountPolicy;
import com.hello.core.section2and3.discount.FixdiscountPolicy;
import com.hello.core.section2and3.discount.RateDiscountPolicy;
import com.hello.core.section2and3.member.Member;
import com.hello.core.section2and3.member.MemberRepository;
import com.hello.core.section2and3.member.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    //    private final DiscountPolicy discountPolicy = new FixdiscountPolicy();
//    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();

    private final DiscountPolicy discountPolicy;
    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) { // 생성자 주입 방식 - 위에 주석은 Service가 직접 Repository 의 역할에 관여한 문제가 있었음.
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
    //Test
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
