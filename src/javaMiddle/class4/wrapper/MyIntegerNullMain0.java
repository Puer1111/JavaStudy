package javaMiddle.class4.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intarr = {-1,0,1, 2, 3};
        System.out.println(findValue(intarr,-1));
        System.out.println(findValue(intarr,0));
        System.out.println(findValue(intarr,1));
        System.out.println(findValue(intarr,100));
    }
    private static int findValue(int[] intarr , int target){
        for(int value: intarr){
            if(value == target){
                return value;
            }
        }
        return 0;
    }
    // 조건에 따른 값이 없다는 표현이 필요한대 반환값이 배열에 있는 값과 같을 땐 구별이 되지 않는다.
}
