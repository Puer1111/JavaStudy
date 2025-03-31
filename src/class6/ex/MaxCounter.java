package class6.ex;

public class MaxCounter {
    private int count =0;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }

    public void increment(){
        max = 10;
        if(count >= max){
            System.out.println("u cant increase more than max");
        }
        else{
            count++;
        }
    }
    public int getCount(){
        return count;
    }
}
