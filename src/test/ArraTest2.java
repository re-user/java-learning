package test;

public class ArraTest2 {
    static void main() {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0){
                count++;
            }
        }
        System.out.println("数组中能被3整除的有"+count+"个");
    }
}
