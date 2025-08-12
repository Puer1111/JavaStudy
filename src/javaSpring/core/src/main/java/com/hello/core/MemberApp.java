package com.hello.core;

import com.hello.core.section2and3.AppConfig;
import com.hello.core.section2and3.member.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
//        MemberService memberService = new MemberServiceImpl();
//
//        AppConfig config = new AppConfig();    // 이제 appconfig 꺼내서 memberService 에 연결한다.
//        MemberService memberService = config.memberService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class); // Configuration 어노테이션을 통해 설정.

        MemberService memberService = applicationContext.getBean("memberService",MemberService.class);  // 컨테이너에서 MemberService 를 가져옴 .

        Member member = new Member(1L , "memberA" , Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(member.getId());
        System.out.println("findMember = " + findMember.getName());
        System.out.println("NewMember = " + member.getName());
    }
}
