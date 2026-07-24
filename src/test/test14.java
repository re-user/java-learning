package test;

public class test14 {
    static void main() {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int [] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
            System.out.println(newArr[i]);
        }
    }
}
