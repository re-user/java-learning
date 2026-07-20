package test;
import java.util.Scanner;
public class test9 {
    static void main() {
        //键盘输入一个整数，判断这个整数是否是回文数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = sc.nextInt();
        int number = 0;
        //将a赋值给temp，用于判断是否是回文数
        int temp = a;
        while (a != 0) {
            int ge = a % 10;
            a = a / 10;
            number = number * 10 + ge;
        }
        if (number == temp) {
            System.out.println(temp +"是回文数");
        } else {
            System.out.println(temp +"不是回文数");
        }
    }
}
