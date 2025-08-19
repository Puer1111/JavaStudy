package com.hello.core.section5.singleton;

public class StatefulService {
//    private int price;    지역변수를 써서 값이 유지되지 않게 한다.
    public int order(String name, int price){
        System.out.println("name = " + name + ", price = " + price);
//        this.price = price; // 문제 발생
        return price;  // 메서드 내부에서 값을 직접 반환.
    }

}
