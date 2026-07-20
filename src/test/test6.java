package test;
public class test6 {
    static void main() {
        //对1~100之间的偶数求和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                System.out.println(sum);
            }
        }
    }
}