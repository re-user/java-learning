package test;

import java.util.Random;

public class test18 {
    static void main() {
        //定义一个数组表示奖池
        int [] arr = {2, 588, 1000, 10000};
        //定义数组储存抽奖的结果
        int newArr[] = new int[arr.length];
        //抽奖
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            //获取随机索引
            int randomIndex = r.nextInt(arr.length);
            //获取随机索引对应的元素；奖项
            int price = arr[randomIndex];
            //判断奖项是否重复,如果重复,则重新抽奖,如果不重复,则将奖项赋值给数组中的元素
            if (!contians(newArr, price)) {
                newArr[i] = price;
                i++;
            }
        }
        //打印数组
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    static boolean contians(int[] arr, int price) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == price) {
                return true;
            }
        }
        return false;
    }
}
