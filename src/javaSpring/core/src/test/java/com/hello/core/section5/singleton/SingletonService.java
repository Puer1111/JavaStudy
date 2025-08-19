package com.hello.core.section5.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();        // static 영역에 미리 instance 생성

    public static SingletonService getInstance() {  // 이제 이거로만 조회할 수 있다.
        return instance;
    }

    private SingletonService() {                // 생성자를 private 으로 막아야 new 키워드 막을 수 있음.
    }
    
    public void logic(){
        System.out.println("싱글톤 객체 호출");
    }
}
