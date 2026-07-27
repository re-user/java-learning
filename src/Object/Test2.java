package Object;

import java.util.Scanner;

public class Test2 {
    static void main() {
        //键盘录入的两套体系不能混用
        //弊端：先用nextiInt,在用nextLine,会导致nextLine接收不到数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num1 = sc.nextInt();
        System.out.println(num1);
        System.out.println("请输入一个字符串");
        String str1 = sc.nextLine();
        System.out.println(str1);
    }
}
