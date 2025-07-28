package com.hello.core.section2and3.discount;

import com.hello.core.section2and3.member.Member;

public interface DiscountPolicy {

    /**
     * @param member
     * @param price
     * @return 할인 대상 금액
     */
    int discount(Member member,int price);

}
