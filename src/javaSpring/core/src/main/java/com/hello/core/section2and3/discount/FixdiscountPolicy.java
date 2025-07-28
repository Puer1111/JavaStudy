package com.hello.core.section2and3.discount;

import com.hello.core.section2and3.member.Grade;
import com.hello.core.section2and3.member.Member;

public class FixdiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
