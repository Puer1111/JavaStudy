package javaBasic.class12.ex2;

public class PayMain {
    public static void main(String[] args) {
        PayService payService = new PayService();
        //kakao
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1,amount1);

        //naver
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2,amount2);

        String payOption4 = "new";
        int amount4 = 10000;
        payService.processPay(payOption4,amount4);

        // 잘못된 결제 수단
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3,amount3);
    }
}
