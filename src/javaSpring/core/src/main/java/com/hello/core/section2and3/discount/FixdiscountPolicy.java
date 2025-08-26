package com.hello.core.section2and3.discount;

import com.hello.core.section2and3.member.Grade;
import com.hello.core.section2and3.member.Member;
import org.springframework.stereotype.Component;

@Component // section 7 : DiscountPolicy 에 2개의 Bean 이 조회되게 하기 위해 설정 -> NoUniqueBeanDefinitionException 발생
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
