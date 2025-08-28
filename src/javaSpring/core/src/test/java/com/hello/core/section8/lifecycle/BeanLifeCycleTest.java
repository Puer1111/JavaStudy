package com.hello.core.section8.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class BeanLifeCycleTest {
    @Test
    public void lifeCycleTest(){
        ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        NetworkClient client = ac.getBean(NetworkClient.class);
        ac.close(); // 자원 닫기
        // 이 시점에서 url 은 객체 생성시 생성자에 url 이 없기에 null 이다. 그니까 DI가 다 되고 나서 호출해야함. 그렇기에 콜백을 준다.

    }
    @Configuration
    static class LifeCycleConfig{
//        @Bean(initMethod = "init", destroyMethod="close") // Method 안에 들어간 문자열이 메서드명임.
        @Bean
        public NetworkClient networkClient(){
            NetworkClient nc = new NetworkClient();
            nc.setUrl("http://www.naver.com");
            return nc;
        }
    }
}
