import java.util.Scanner;

public class test1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数");
        int week = sc.nextInt();
        //利用case特性进行穿透，避免重复代码
        switch (week) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");

            case 6, 7 -> System.out.println("休息日");

            default -> System.out.println("没有这个星期");
        }
    }
}