package javaBasic.class6.ex;

public class MaxCounterMain {
    public static void main(String[] args) {
        MaxCounter max = new MaxCounter(6);
        max.increment();
        max.increment();
        max.increment();
        max.increment();
        max.increment();
        int count =  max.getCount();
        System.out.println("Answer: " + count);
    }
}
