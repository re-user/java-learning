import java.util.Scanner;

public class test7 {
    static void main() {
        //键盘录入两个数字表示范围，求这个范围内的所有3的倍数且5的倍数的个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数，表示范围的开始");
        int start = sc.nextInt();
        System.out.println("请输入一个整数，表示范围的结束");
        int end = sc.nextInt();
        int count = 0;
        //对录入的数字进行判断，是否第一个数小于第二个数
        if (start > end) {
            System.out.println("您录入的范围有误");
            return;
        }
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
