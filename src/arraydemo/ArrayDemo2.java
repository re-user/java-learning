package arraydemo;

public class ArrayDemo2 {
    static void main() {

        //利用索引对数组的元素进行访问
        //1.获取数组里的元素
        // 格式： 数组名[索引]
        int[] arr = {1, 2, 3, 4, 5};
        //获取数组中的第一个数据
        //其实就是获取索引为0的元素
        int number = arr[0];
        System.out.println(number);//1
        //获取数组中索引为1上对应的数据，并打印出来
        System.out.println(arr[1]);//2

        //2.把数据存储到数组当中
        // 格式： 数组名[索引] = 具体数据/变量
        // 细节：一旦覆盖之后，之前的数据就会丢失。
        arr[0] = 100;
        System.out.println(arr[0]);//100
    }
}