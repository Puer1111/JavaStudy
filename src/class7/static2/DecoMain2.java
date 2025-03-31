package class7.static2;

public class DecoMain2 {
    public static void main(String[] args) {

        String s = "Hello Java";
        String deco = DecoUtil2.deco(s);

        System.out.println("before = " + s);
        System.out.println("after = " + deco);

        // 메소드에도 Static 이 붙으면 객체 생성 필요 없이 클래스 명으로 바로 메소드를 호출 할 수 있다.
    }
}
