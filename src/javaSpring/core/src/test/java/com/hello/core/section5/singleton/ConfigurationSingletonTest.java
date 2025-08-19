package com.hello.core.section5.singleton;

import com.hello.core.section2and3.AppConfig;
import com.hello.core.section2and3.member.MemberRepository;
import com.hello.core.section2and3.member.MemberService;
import com.hello.core.section2and3.member.MemberServiceImpl;
import com.hello.core.section2and3.member.MemoryMemberRepository;
import com.hello.core.section2and3.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigurationSingletonTest {
    @Test
    @DisplayName("configuration 실험해보기")
    void configurationTest() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberServiceImpl memberService = ac.getBean("memberService", MemberServiceImpl.class);
        OrderServiceImpl orderService = ac.getBean("orderService", OrderServiceImpl.class);
        MemberRepository memoryRepository = ac.getBean("memberRepository", MemberRepository.class);

        MemberRepository memberRepository = memberService.getMemberRepository();
        MemberRepository memberRepository2 = orderService.getMemberRepository();
        System.out.println("memberRepository1 = " + memberRepository);
        System.out.println("memberRepository2 = " + memberRepository2);
        System.out.println("memberRepository3 = " + memoryRepository);

        Assertions.assertThat(memberService.getMemberRepository()).isSameAs(memberRepository);
        Assertions.assertThat(orderService.getMemberRepository()).isSameAs(memberRepository);
        // 셋 다 같은 참조값 주소 확인할 수 있다.

    }

    @Test
    void configurationDeep(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig bean = ac.getBean(AppConfig.class);

        System.out.println("bean = " + bean.getClass());
        //class com.hello.core.section2and3.AppConfig$$SpringCGLIB$$0
        // $$ 이거 뭐임? : 스프링이 CGLIB 라는 라이브러리를 통해 AppConfig 를 상속받은 임의의 다른 클래스를 만들고 Bean 으로 등록함

    }
}
