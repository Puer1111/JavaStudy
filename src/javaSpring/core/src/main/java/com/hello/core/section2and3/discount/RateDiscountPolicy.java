package com.hello.core.section2and3.discount;

import com.hello.core.section2and3.member.Grade;
import com.hello.core.section2and3.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discounPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discounPercent / 100;
        } else {
            return 0;

        }

    }
}
