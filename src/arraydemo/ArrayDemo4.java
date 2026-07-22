package arraydemo;

public class ArrayDemo4 {
    static void main() {
        /*定义一个数组，用来存储班级50个学生的姓名
        姓名未知，等学生报道之后，再进行添加。*/

        //格式：
        //数据类型[] 数组名 = new 数据类型[数组的长度];
        //在创建的时候，由我们自己指定数组的长度，由虚拟机给出默认的初始化值
        String[] arr = new String[50];
        //添加学生
        arr[0] = "zhangsa=han";
        arr[1] = "lisi";
        //获取
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);

        //数组默认初始化的规律
        //整数类型，默认初始化值0
        //小数类型，默认初始化值0.0
        //字符类型，默认初始化值'/u0000'空格
        //引用数据类型：默认初始化值 null
        int[] arr2 = new int[3];
        System.out.println(arr[0]);//0
        System.out.println(arr[1]);//0
        System.out.println(arr[2]);//0
    }
}
