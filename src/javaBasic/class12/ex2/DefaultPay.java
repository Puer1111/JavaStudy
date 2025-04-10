package javaBasic.class12.ex2;

public class DefaultPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 방식이 없습니다.");
        return false;
    }
}
