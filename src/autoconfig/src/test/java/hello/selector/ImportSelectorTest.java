package hello.selector;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.*;

public class ImportSelectorTest {

    @Test
    /**
     * 스프링 컨테이너 생성 -> StaticConfig.class 초기 설정 정보 사용 후 HelloBean Bean 등록 확인
     */
    void staticConfig() {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(StaticConfig.class);
        HelloBean bean = appContext.getBean(HelloBean.class);
        assertThat(bean).isNotNull();

    }

    @Test
    /**
     * selectorConfig 를 초기 설정 정보 사용 -> @Import(HelloImportSelector.class)
     * -> ImportSelector 의 구현체로써 HelloImportSelector 의 메서드 반환으로 HelloConfig 패키지 (문자열) 반환
     */
    void selectorConfig() {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(SelectorConfig.class);
        HelloBean bean = appContext.getBean(HelloBean.class);
        assertThat(bean).isNotNull();
    }


    @Configuration
    @Import(HelloConfig.class)
    public static class StaticConfig {

    }

    @Configuration
    @Import(HelloImportSelector.class)
    public static class SelectorConfig {
    }
}
