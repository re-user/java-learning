package arraydemo;

public class ArrayDemo3 {
    static void main() {


        //1.定义数组
        int[] arr = {1, 2, 3, 4, 5};
        //2.获取数组里的所有元素
        //格式： 数组名[索引]
        /*System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);*/
        //利用循环改进代码
        //开始条件：0
        //结束条件：数组的长度-1
        //在java中，关于数组的一个长度属性：length
        //调用方法：arr.length
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            //数组名.fori
        }
    }
}
