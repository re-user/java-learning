package test;

import java.util.Scanner;

public class test16 {
    static void main() {
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);
        //把数组中的元素赋值为用户输入的整数
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入一个整数：");
            int num = sc.nextInt();
            arr[i] = num;
        }
        //将数组中的元素加5并对10取余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
            arr[i] = arr[i] % 10;
        }
        //将数组中的元素反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //打印数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}


