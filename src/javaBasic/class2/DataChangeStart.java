package javaBasic.class2;

public class DataChangeStart {
    public static void main(String[] args) {
//      참조형의 경우에는 값을 복사하는게 아닌 참조값을 복사한다.
//      기본형은 값 자체 복사함
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;
        System.out.println("dataA 값: " + dataA.value);
        System.out.println("dataB 값: " + dataB.value);

        dataA.value = 20;
        dataB.value = 30;
        System.out.println("바뀐 dataA 값: " + dataA.value);
        System.out.println("바뀐 dataB 값: " + dataB.value);

    }
}
