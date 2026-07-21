package test;

import java.util.Scanner;

public class LoopTest3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < number-1; i++) {
            if (number % i == 0) {
                flag = false;
                //System.out.println(number + "不是质数");
                break;
            }/*else{
                System.out.println(number + "是质数");
            }*/
        }
        if(flag){
            System.out.println(number + "是质数");
        }else{
            System.out.println(number + "不是质数");
        }
    }
}
