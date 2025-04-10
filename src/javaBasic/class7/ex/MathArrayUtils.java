package javaBasic.class7.ex;

public class MathArrayUtils {

    private MathArrayUtils() {} // 객체 생성을 막으려면 생성자를 private 으로 막으면 된다.

    public static int sum(int[] values) {
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            int value = values[i];
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values) {
        return (double)sum(values)/values.length;

    }

    public static int min(int[] values) {
//        int temp = 1;
//        int min = 0;
//
//        for (int value : values) {
//            min = Math.min(value, temp);
//        }
//        return min;
        // 내가 생각했던 거.
        int minvalue= values[0];
        for (int value : values) {
            if (value < minvalue) {
                minvalue = value;
            }
        }
        return minvalue;
    }

    public static int max(int[] values) {
//        int temp = 0;
//        int max = 0;
//
//        for (int value : values) {
//            max = Math.max(value, temp);
//        }
//        return max;

        int maxvalue= values[0];
        for (int value : values) {
            if (value > maxvalue) {
                maxvalue = value;
            }
        }
        return maxvalue;
    }

}
