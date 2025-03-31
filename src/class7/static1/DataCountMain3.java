package class7.static1;

public class DataCountMain3 {
    public static void main(String[] args) {

        Data3 data = new Data3("A");
        System.out.println("A Count = " + data.count);

        Data3 data2 = new Data3("B");
        System.out.println("B Count = " + Data3.count); // 이전과 다르게 클래스명에 dot 을 사용한다. 클래스에 직접 접근하는 느낌.

        Data3 data3 = new Data3("C");
        System.out.println("C Count = " + Data3.count);
    }

    // Static 변수는 Method 영역에서 관리한다. 따라서 객체 영역에 생성되지 않기에 Heap 에 들어가지 않음.
}
