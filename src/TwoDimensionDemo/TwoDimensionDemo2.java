package TwoDimensionDemo;

public class TwoDimensionDemo2 {
    static void main() {

    /*
    二维数组动态初始化格式：
    数据类型[][] 数组名 = new 数据类型[m][n]；
    m:表示这个二维数组，可以多少个个一维数组
    n:表示每个二维数组，可以有多少个元素
     */

        //利用动态初始化格式创建二维数组
        //3：表示这个二维数组，可以存放3个一维数组
        //5：表示每个二维数组，可以存放5个元素
        int[][] arr = new int[3][5];

        //给二维数组赋值一个元素
        arr[0][0] = 10;

        //遍历二维数组
        //外循环：得到里面的每一个一维数组
        for (int i = 0; i < arr.length; i++) {
            //i：二维数组的索引，获取出来的是里面的一维数组
            //arr[i]：获取二维数组的第i个一维数组
            //arr[i][j]：获取二维数组的第i个一维数组的第j个元素
            // 内循环，遍历一维数组中的每一个元素
            for (int j = 0; j < arr[i].length; j++) {
                //j：一维数组的索引，获取出来的是里面的一维数组的元素
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
