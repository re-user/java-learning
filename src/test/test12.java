package test;

public class test12 {
    static void main() {
        int count = 0;
        //外循环遍历99到200之间的所有数字
        for (int i = 99; i < 200; i++) {
            boolean flag = true;
            //内循环判断当前数字是否为质数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.println("当前数字为：" + i + "，是质数");
            }
        }
        System.out.println("99到200之间的质数有" + count + "个");
    }
}