package test;

public class ArraTest1 {
    static void main() {
        int [] arr = {1,2,3,4,5};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
