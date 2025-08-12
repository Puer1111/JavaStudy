package com.hello.core.section4.beanfind;

import com.hello.core.section2and3.AppConfig;
import com.hello.core.section2and3.member.MemberService;
import com.hello.core.section2and3.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextBasicFindTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("빈 이름으로 조회")
    void findBeanByName(){
        MemberService memberService = context.getBean("memberService", MemberService.class);
        System.out.println(memberService);
        System.out.println(memberService.getClass());

        Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl.class); // MemberServiceImpl 이 memberService 를 제대로 대체 하는가.
    }

    @Test
    @DisplayName("이름없이 타입으로 조회")
    void findBeanByType(){
        MemberService memberService = context.getBean("memberService", MemberService.class);
        Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl.class); // MemberServiceImpl 이 memberService 를 제대로 대체 하는가.
    }

    @Test
    @DisplayName("구체 타입으로 조회")
    void findBeanByType2(){
        MemberServiceImpl memberService = context.getBean("memberService", MemberServiceImpl.class);     // 실제 구현되는 애로도 확인 가능하지만 SOLID 의 S 처럼 인터페이스로 확인하는게 좋음.
        Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @Test
    @DisplayName("빈 이름으로 조회 X ")
    void findBeanByNameX(){
//        MemberService memberService = context.getBean("XXXX",MemberService.class); //NoSuchBeanDefinitionException: No bean named 'XXXX' available
        org.junit.jupiter.api.Assertions.assertThrows(NoSuchBeanDefinitionException.class,      // NoSuch 에러가 터지면 애로우 함수 가 실행 된다.
                () -> context.getBean("XXXX",MemberService.class));
    }

}
