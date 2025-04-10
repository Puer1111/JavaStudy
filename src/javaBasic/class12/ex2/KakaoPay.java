package javaBasic.class12.ex2;

public class KakaoPay implements Pay{

    @Override
    public boolean pay(int amount){
        if(amount != 0){
        System.out.println("카카오페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
        }
        else{
            return false;
        }
    }
}
