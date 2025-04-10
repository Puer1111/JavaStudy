package javaBasic.OOP.ex;

public class Rectangle {
    int height;
    int width;

    int calculateArea() {
       return width * height;
    }
    boolean isSquare() {
        if(width == height) {
            return true;
        }
        return false;
    }
    int calculatePerimeter() {
        return (width + height) * 2;
    }
}
