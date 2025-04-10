package javaBasic.OOP.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000); // 오류
        System.out.println("account balance : " + account.balance);
    }
}
