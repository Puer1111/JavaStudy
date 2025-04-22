package javaMiddle.class3.string.ex;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
        System.out.println("index = " + index);
        while(index != -1) {
            index = str.indexOf(key,index+1);    // key를 찾고 난 바로 다음 순서.
            count++;
        }
        System.out.println("Count = " + count);
    }
}
