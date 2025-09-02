package com.hello.core.common.section9;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
//@Scope(value = "request") // 이 상태로 서버를 키면 MyLogger 빈의 생명주기는 고객이 "요청" 하면서 시작되는데 현재 코드에선 요청 자체를 하지 않기에 에러가 난다. 따라서 이를 테스트 하기 위해 Provider 를 사용한다.
@Scope(value = "request",proxyMode = ScopedProxyMode.TARGET_CLASS) //

public class MyLogger {

    private String uuid;
    private String requestURL;

    public void setRequestURL(String requestURL) {
        this.requestURL = requestURL;
    }

    public void log(String message) {
        System.out.println("[ " + uuid + "]" + "[" + requestURL + "]" + message);
    }

    @PostConstruct
    public void init() {
        uuid = UUID.randomUUID().toString(); // uuid 랜덤 생성
        System.out.println("[ " + uuid + "] request scope bean create:" + this);
    }

    @PreDestroy
    public void close() {
        System.out.println("[ " + uuid + "] request scope bean close:" + this);

    }
}

