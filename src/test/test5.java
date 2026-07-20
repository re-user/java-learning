package test;
public class test5 {
    static void main() {
        //求1~5之间的和
        //1.求和的变量不能定义在循环里面，因为变量只能在所属的大括号中才有效
        //2.如果我们把变量定义在循环里面，那么当前变量只能在本次循环中有效
        //当本次循环结束之后，变量就会从内存中消失
        //当二次循环开始的时候，又会重新定义一个新的变量
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
    }
}

