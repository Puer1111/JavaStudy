package javaBasic.class6.b;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.getBalance();

        account.withdraw(5000);
        account.getBalance();

    }
}
