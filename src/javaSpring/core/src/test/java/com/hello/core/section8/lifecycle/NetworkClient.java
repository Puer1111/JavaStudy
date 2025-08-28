package com.hello.core.section8.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class NetworkClient  {
    private String url;

    public NetworkClient() {
        System.out.println("url = " + url);
        connect();
        call("초기화 연결 메시지");
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void connect(){
        System.out.println("Connecting to " + url);
    }
    public void call(String message){
        System.out.println("call:" + url + "message = " + message);
    }
    public void disconnect(){
        System.out.println("Disconnecting from " + url);
    }

//    @Override // DisposableBean 메서드
//    public void destroy() throws Exception {
//        System.out.println("Destroy");
//        disconnect();
//    }
//
//    @Override // Initializing Bean
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("afterPropertiesSet");
//        connect();
//        call("초기화 메시지");
//    }
    @PostConstruct
    public void init() throws Exception {
        System.out.println("init");
        connect();
        call("초기화 메시지");
    }
    @PreDestroy
    public void close() throws Exception {
        System.out.println("close");
        disconnect();
    }

}
