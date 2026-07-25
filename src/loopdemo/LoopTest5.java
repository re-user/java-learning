package test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest5 {
    static void main() {
        //生成1-100之间的随机数,使用程序实现猜出随机数是多少？
        //添加保底机制，用户猜到第三次提示用户猜中了
        Random random = new Random();
        int number = random.nextInt(1,100);
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true) {
            System.out.println("请输入您要猜的数字");
            int guessNumber = sc.nextInt();
            count++;
            if(count==3){
                System.out.println("恭喜您猜对了");
                break;
            }

            if (guessNumber > number) {
                System.out.println("您猜的数字太大了");
            } else if (guessNumber < number) {
                System.out.println("您猜的数字太小了");
            } else {
                System.out.println("恭喜您猜对了");
                break;
            }
        }
    }
}
