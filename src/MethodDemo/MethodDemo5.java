package MethodDemo;

public class MethodDemo5 {
    static void main() {
        //直接调用方法
        getsum(10, 20, 30);
        //赋值调用方法
        // int sum = getsum(10, 20, 30);
        //  System.out.println(sum);
        //输出调用方法
        //System.out.println(getsum(10, 20, 30));

        //算第一个季度的营业额
        int sum1 = getsum(10, 20, 30);
        //算第二个季度的营业额
        int sum2 = getsum(10, 20, 30);
        //算第三个季度的营业额
        int sum3 = getsum(10, 20, 30);
        //算第季度的营业额
        int sum4 = getsum(10, 20, 30);
        //算总营业额
        int total = sum1 + sum2 + sum3 + sum4;
        System.out.println(total);
    }

    public static int getsum(int a, int b, int c) {
        int result = a + b + c;
        return result;//返回给方法的调用处
    }
}