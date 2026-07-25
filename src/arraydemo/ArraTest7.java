package test;

public class ArraTest7 {
    static void main() {
        //定义一个数组，将数组中0索引和最大索引的元素交换位置
        int[] arr = {1, 2, 3, 4, 5};
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        //遍历数组，打印数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
