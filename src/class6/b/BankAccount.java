package class6.b;

public class BankAccount {
    private int balance;

    public BankAccount(){
        this.balance = 0;
    }

    // public Method : deposit
    public void deposit(int amount){
        if(isAmountValid(amount)){
        balance += amount;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    // public method : withdraw
    public void withdraw(int amount){
        if(isAmountValid(amount) && balance - amount >= 0){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient Balance Or Not Enough");
        }
    }
    // public method : getBalance
    public int getBalance(){
        System.out.println("Current Balance: " + balance);
        return balance;
    }

    private boolean isAmountValid(int amount){
        // 금액이 양수인가.
        return amount > 0;
    }
}
