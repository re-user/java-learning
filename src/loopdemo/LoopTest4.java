package test;

import java.util.Random;

public class LoopTest4 {
    static void main() {
        Random random = new Random();
        //生成0-100之间的随机数
        int number = random.nextInt(101);
        System.out.println(number);
    }
}
