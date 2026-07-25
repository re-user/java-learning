package test;

import java.util.Random;

public class ArraTest9 {
    static void main() {
        //定义一个数组，存入1~5，要求打乱数组元素的顺序
        int[] arr = {1, 2, 3, 4, 5};
        Random random = new Random();
        int randomIndex = random.nextInt(arr.length);
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
