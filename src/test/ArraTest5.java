package test;

import java.util.Random;

public class ArraTest5 {
    static void main() {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {

            int number = random.nextInt(1, 100);
            arr[i] = number;
        }

        // 1.计算数组元素的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组元素的和为：" + sum);

        // 2.计算数组元素的平均值
        int avg = sum / arr.length;
        System.out.println("数组元素的平均值为：" + avg);

        //3.统计数组元素中大于平均值的个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                count++;
            }
        }
        System.out.println("数组元素中大于平均值的个数为：" + count);
        //遍历数组，打印数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
