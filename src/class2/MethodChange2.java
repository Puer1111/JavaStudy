package class2;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메소드 전 : " + dataA.value);
        changeReference(dataA);
        System.out.println("메소드 후 : " + dataA.value);
    }
    static void changeReference(Data dataX){
        System.out.println("메소드 안 : " +  dataX.value);
        dataX.value = 30;
    }
}
