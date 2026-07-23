package test;

public class MethodTest3 {
    static void main() {
        int area1 = compare(10, 20);
        int area2 = compare(15, 20);
        if(area1 > area2) {
            System.out.println("第一个矩形的面积大");
        } else {
            System.out.println("第二个矩形的面积大");
        }
    }

    static int compare(int len, int width) {
        int area = len * width;
        return area;
    }
}
