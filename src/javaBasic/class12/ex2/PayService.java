package javaBasic.class12.ex2;

public class PayService{

    public void processPay(String option, int amount) {
        boolean result = false;
        System.out.println("결제를 시작합니다: option =" + option + ", amount =" + amount);

        Pay pay = PayStore.findPay(option);

        result = pay.pay(amount);
        if(result){
            System.out.println("결제에 성공했습니다.");
        }
        else{
            System.out.println("결제에 실패했습니다.");
        }
    }
    // 결제 방식과 결제 처리 부분을 *분리 했음.
    // 서비스 파트에서는 과정 처리부분만 나오게 하는것이 깔끔.
    // Repo역할의 PayStore 생성해서 결제 방식 한곳에 모아둠.
    // PayStore 호출로 결제 방식 정리.


//    private KakaoPay kakaoPay;
//    private NaverPay naverPay;

//    public void processPay(String payOption, int amount) {
//        System.out.println("결제를 시작합니다: option= " + payOption + ", amount= " + amount);
//        if(payOption.equals("kakao")) {
//            kakaoPay = new KakaoPay();   // 인스턴스 생성하는거 까먹지 말기.
//            boolean result = kakaoPay.pay(amount);
//        }
//        else if(payOption.equals("naver")) {
//            naverPay = new NaverPay();
//            boolean result = naverPay.pay(amount);
//        }
//        else if(payOption.equals("bad")){
//            System.out.println("잘못된 결제 방식입니다.");
//        }
//    }
    // 코드 문제점 1 : 객체 의존도가 높다. KakaoPay() , NaverPay() 를 직접 만듬.
    // 2. 결제 서비스 안에 결제 선택 , 결제 금액처리 두개가 반복됨. 이를 쪼갠다.



}
