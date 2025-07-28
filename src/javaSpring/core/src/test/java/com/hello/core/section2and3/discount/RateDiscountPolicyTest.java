package com.hello.core.section2and3.discount;

import com.hello.core.section2and3.member.Grade;
import com.hello.core.section2and3.member.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP 는 10% 할인이 적용되어야 한다")
    void vip_0(){
        //given
            Member member = new Member(1L,"memberVIP", Grade.VIP);
        //when
            int discount = rateDiscountPolicy.discount(member,10000);
        //then
            Assertions.assertEquals(discount, 1000);
    }
    @Test
    @DisplayName("VIp 아니면 할인 적용되면 안된다.")
    void vip_x(){
        Member member = new Member(1L,"memberVIP", Grade.BASIC);
        int discount = rateDiscountPolicy.discount(member,10000);
        Assertions.assertEquals(discount, 1000);
    }

}