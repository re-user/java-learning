package test;

public class MethodTest1 {
    static void main() {
        getlength(5.2, 1.3);
    }
    public static void getlength(double len, double width) {
        double result = (len + width) * 2;
        System.out.println(result);
    }
}
