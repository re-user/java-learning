package test;

public class MethodTest2 {
    static void main() {
        getArea(1.5);
    }

    public static void getArea(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println(result);
    }
}