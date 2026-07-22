package test;

public class ArraTest4 {
    static void main() {
        int[] arr = {33, 5, 22, 44, 55};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
