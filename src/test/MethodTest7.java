package test;

public class MethodTest7 {
    static void main() {
        int[] arr = {1, 5, 8, 2, 10};
        boolean result = contains(arr, 12);
        System.out.println(result);
    }
    static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
