package test;

public class MethodTest5 {
    static void main() {
        int[] arr = {11, 22, 33, 44, 55};
        printArray(arr);
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
