package com.hello.core.section5.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class StatefulServiceTest {
    @Test
    void statefulServiceSingleton(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService service1 = ac.getBean(StatefulService.class);
        StatefulService service2 = ac.getBean(StatefulService.class);
        //Thread A
        int userAPrice = service1.order("userA" , 10000);
        // Thread B
        service2.order("userB" , 20000);

        //Thread A : 조회
//        int price = service1.getPrice();
        System.out.println("price = " + userAPrice);
//        Assertions.assertThat(service1.getPrice()).isEqualTo(20000); // 이러면 이제 price 가 상태 유지되기에 20000원이 나오는걸 볼 수 있다 . 해결 : statefulService 확인
    }
    static class TestConfig{
        @Bean
        public StatefulService statefulService(){
            return new StatefulService();
        }
    }
}
