package test;

public class test17 {
    static void main() {
        //对test16加密的数字进行解密
        int[] arr = {8, 3, 4, 6};
//反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] < 5) {
                arr[i] = arr[i] + 10;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
            System.out.println(number);
        }
    }
}

