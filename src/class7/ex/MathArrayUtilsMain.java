package class7.ex;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int [] values = {1, 2, 3, 4, 5};
        System.out.println("Sum = " + MathArrayUtils.sum(values));
        System.out.println("Average = " + MathArrayUtils.average(values));
        System.out.println("min= " + MathArrayUtils.min(values));
        System.out.println("max= " + MathArrayUtils.max(values));
    }
}
