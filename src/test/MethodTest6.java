package test;

public class MethodTest6 {
    static void main() {
        int[] arr = {1, 5, 7, 3, 10};
        int max = findMax(arr);
        System.out.println(max);
    }
    static int findMax(int[]  arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
