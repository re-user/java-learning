package arraydemo;

public class ArrayDemo5 {
    static void main() {
        //1.定义一个数组
        int [] arr = {1,2,3,4,5};
        //长度5
        //最小索引0
        //最大索引4(数组长度-1)
        System.out.println(arr[10]);
        //小结：
        //索引越界异常
        //原因：访问了不存在的索引
        //避免：索引的范围
    }
}
