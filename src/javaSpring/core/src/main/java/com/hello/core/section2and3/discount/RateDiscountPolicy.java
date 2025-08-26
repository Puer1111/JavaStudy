package com.hello.core.section2and3.discount;

import com.hello.core.annotation.MainDiscountPolicy;
import com.hello.core.section2and3.member.Grade;
import com.hello.core.section2and3.member.Member;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
//@MainDiscountPolicy // section 7 : Qualifier 의 문자는 컴파일에 걸리지 않기에 에러가 잡히지 않는다 따라서 어노테이션을 직접 만들어서 사용하면 선언할떄 오타에 따라 에러가 걸림.
@Component
public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;

        }

    }
}
