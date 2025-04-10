package javaBasic.OOP.ex;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 100;
        rectangle.height = 100;

        int area = rectangle.calculateArea();
        System.out.println("Area of rectangle is: " + area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("Perimeter of rectangle is: " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("Square rectangle is: " + square);
    }
}
