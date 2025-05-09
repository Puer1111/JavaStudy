package javaBasic.class12.ex2;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();

        while(true) {
            System.out.print("결제 수단을 입력하세요: ");
            String payOption = sc.nextLine();

            if(payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("결제 금액을 입력하세요: ");
            int amount = sc.nextInt();
            sc.nextLine(); // int 뒤에 한줄 띄게 꼭 작성

            payService.processPay(payOption, amount);
        }
    }
}
