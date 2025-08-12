package com.hello.core.section4.beanfind;

import com.hello.core.section2and3.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextInfoTest {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력")
    void findAllBean() {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            Object bean = context.getBean(beanDefinitionName);
            System.out.println("name = " + beanDefinitionName + " object = " + bean);
        }

    }
    @Test
    @DisplayName("Application 빈 출력")
    void findApplicationBean() {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = context.getBeanDefinition(beanDefinitionName);

            // Role_Application : 직접 등록한 Application Bean
            // Role_infrastructure : 빈 이름으로 빈 객체 조회.
            // 이 둘은 getRole 로 비교
            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                Object bean = context.getBean(beanDefinitionName);
                System.out.println("name = " + beanDefinitionName + " object = " + bean);
            }
        }

    }
}
