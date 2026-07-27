package Object;

import java.util.Scanner;

public class Test1 {
    static void main() {
        //键盘录入
        //第一套体系
        //nextInt();接受整数
        //nextDouble();接受浮点数
        //next();接受字符串
        //遇到空格，制符表，回车就停止接受。这些符号后面的数据就不会被接收了

        //第二套体系
        //nextLine();接收字符串
        //可以接收空格，制表符，遇到回车才会停止接收
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();//123
        System.out.println(num1);
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        System.out.println(num2);


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();
        System.out.println(str1);
        System.out.println("请输入第二个字符串");
        String str2 = sc.next();
        System.out.println(str2);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.nextLine();
        System.out.println(str1);
        System.out.println("请输入第二个字符串");
        String str2 = sc.nextLine();
        System.out.println(str2);
    }
}
