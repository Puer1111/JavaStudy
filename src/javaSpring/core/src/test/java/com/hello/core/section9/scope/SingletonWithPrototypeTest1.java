package com.hello.core.section9.scope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import javax.inject.Provider;

public class SingletonWithPrototypeTest1 {
    @Test
    void prototypeFind() {  // 프로토 타입 요청하기.
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(PrototypeBean.class);
        PrototypeBean prototypeBean = ac.getBean(PrototypeBean.class);
        prototypeBean.addCount();
        Assertions.assertThat(prototypeBean.getCount()).isEqualTo(1);

        PrototypeBean prototypeBean2 = ac.getBean(PrototypeBean.class);
        prototypeBean2.addCount();
        Assertions.assertThat(prototypeBean2.getCount()).isEqualTo(1);
    }

    @Test
    void singletonClientUsePrototype() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ClientBean.class, PrototypeBean.class);
        ClientBean clientBean = ac.getBean(ClientBean.class);
        int count1 = clientBean.logic();
        Assertions.assertThat(count1).isEqualTo(1);

        ClientBean clientBean2 = ac.getBean(ClientBean.class);
        int count2 = clientBean2.logic();
        Assertions.assertThat(count2).isEqualTo(1);
        // 이건 싱글톤과 다르지 않기 때문에 의존 주입 시점을 바꿔서 프로토타입 본래 역할을 쓰기 위해 리팩토링 한다.
        // 싱글톤 안에서 프로토 타입이 있지만 싱글톤과 같이 유지 되는것이 문제.
    }

    @Scope("prototype")
    static class PrototypeBean {
        private int count = 0;

        public void addCount() {
            count++;
        }

        public int getCount() {
            return count;
        }

        @PostConstruct
        public void init() {
            System.out.println("PrototypeBean.init" + this);
        }

        @PreDestroy // 프로토타입이라 어차피 안됨.
        public void destroy() {
            System.out.println("PrototypeBean.destroy" + this);
        }
    }

    @Scope("singleton")
    static class ClientBean {


//        private final ObjectProvider<PrototypeBean> prototypeBeansProvider;
        private Provider<PrototypeBean> prototypeBeanProvider;

//        public ClientBean(ObjectProvider<PrototypeBean> prototypeBeansProvider) {
//            this.prototypeBeansProvider = prototypeBeansProvider;
//        }

        public ClientBean(Provider<PrototypeBean> prototypeBeanProvider) {
            this.prototypeBeanProvider = prototypeBeanProvider;
        }

        // @Autowired
//        ApplicationContext applicationContext; // 스프링 컨테이너 자체를 DI 해버린다. 근데 이건 좀 더러운 코드가 됨.
        // 이렇게 외부에서 주입 받는게 아니라 내가 직접 찾는걸 DL(Dependency Lookup) 이라 한다.

//        private final PrototypeBean prototypeBean; // 생성 시점 주입으로 바꾼다.
//
//        public ClientBean(PrototypeBean prototypeBean) {
//            this.prototypeBean = prototypeBean;
//        }

        public int logic() {
//            PrototypeBean prototypeBean = applicationContext.getBean(PrototypeBean.class);
//            prototypeBean.addCount();
            PrototypeBean prototypeBean = prototypeBeanProvider.get(); // Provider 를 통해 필요한 내용을 찾는다
            prototypeBean.addCount();
            return prototypeBean.getCount();
        }

    }

}
