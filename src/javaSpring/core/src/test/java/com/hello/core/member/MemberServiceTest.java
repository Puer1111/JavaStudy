package com.hello.core.member;

import com.hello.core.section2and3.AppConfig;
import com.hello.core.section2and3.member.Grade;
import com.hello.core.section2and3.member.Member;
import com.hello.core.section2and3.member.MemberService;
import com.hello.core.section2and3.member.MemberServiceImpl;
import com.hello.core.section2and3.order.OrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
MemberService memberService;
OrderService orderService;

    @BeforeEach
    public void init() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void join() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);


        //when
        memberService.join(member);
        Member findMember = memberService.findMember(member.getId());
        //then

        Assertions.assertEquals(member,findMember);
    }
}
