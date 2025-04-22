package javaMiddle.class3.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        //가변의 String 이다 sb가 계속 바뀌는거 확인.
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println(sb);

        sb.insert(1,"JAVA");
        System.out.println("Insert = " + sb);

        sb.delete(4,8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        //StringBuilder --> String
        String string = sb.toString();
        System.out.println("string = " + string);

        // 가변을 계속 두지 않고 변경이 끝나면 불변으로 바꾸는 것이 좋다.
    }
}
