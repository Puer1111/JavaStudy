package com.hello.core.section4.beanfind;

import com.hello.core.section2and3.AppConfig;
import com.hello.core.section2and3.discount.DiscountPolicy;
import com.hello.core.section2and3.member.Member;
import com.hello.core.section2and3.member.MemberRepository;
import com.hello.core.section2and3.member.MemberService;
import com.hello.core.section2and3.member.MemoryMemberRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ApplicationContextSameBeanFindTest {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SameBeanConfig.class);

    @Test
    @DisplayName("타입으로 조회 시 같은 타입이 둘 이상 시 ,중복 오류")
    void findBeanByDuplicate() {
//        MemberRepository memberRepo = context.getBean(MemberRepository.class);
        //.MemberRepository' available: expected single matching bean but found 2: memberRepository1,memberRepository2 : Bean 이 같은 이름으로 2개야
        assertThrows(NoUniqueBeanDefinitionException.class, () -> context.getBean(MemberRepository.class));
    }

    @Test
    @DisplayName("타입으로 조회 시 같은 타입이 둘 이상이면 , 빈 이름을 지정하라")
    void findBeanByDuplicate2() {
        MemberRepository memberRepository = context.getBean("memberRepository1", MemberRepository.class);
        assertThat(memberRepository).isInstanceOf(MemberRepository.class);

    }
    @Test
    @DisplayName("특정 타입 모두 조회")
    void findBeanByType() {
        Map<String,MemberRepository> beansOfType = context.getBeansOfType(MemberRepository.class);
        for(String key:beansOfType.keySet()){
            System.out.println("Key = " + key + " value = " + beansOfType.get(key));
        }
        System.out.println("beansOfType = " + beansOfType);
        assertThat(beansOfType.size()).isEqualTo(2);

    }


    @Configuration
    static class SameBeanConfig {
        @Bean
        public MemberRepository memberRepository1() {
            return new MemoryMemberRepository();
        }

        @Bean
        public MemberRepository memberRepository2() {
            return new MemoryMemberRepository();
        }
    }
}
