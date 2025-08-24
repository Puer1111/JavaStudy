package com.hello.core.section6;

import com.hello.core.section2and3.member.MemberRepository;
import com.hello.core.section2and3.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(     // 만약 빈 이름이 중복이라면? -> ConflictBeanDefinitionException 오류가 뜬다.
        basePackages = "com.hello.core",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) // Configuration 붙은 클래스는 제외 해야 제대로 작동하는지 본다. Bean 같이 떙겨져 버림.
)
public class AutoAppConfig {
    @Bean(name = "memoryMemberRepository") // 만약 자동 등록 빈과 수동 등록 빈이 만나면 ? 수동 빈 등록이 우선권을 가지며 자동 등록 빈을 오버라이딩 해버린다. 최근엔 오류 나게 스프링 부트가 바뀜.
                                            // CoreApplication 실행 해보면 에러 문구 나옴.
    MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
