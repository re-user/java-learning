package test;

public class MethodTest8 {
    static void main() {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = copyofRange(arr1, 3, 6);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
    static int[] copyofRange(int[] arr, int form, int to) {
        int[] arr2 = new int[to - form];
        //伪造索引
        int index = 0;
        for (int i = form; i <to; i++) {
            arr2[index] = arr[i];
            index++;
        }
        return arr2;
    }
}
