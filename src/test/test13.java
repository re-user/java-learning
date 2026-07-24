package test;

import java.util.Random;

public class test13 {
    static void main() {
        //随机生成一个前四位是大写字母的随机字母最后一位是数字的验证码
        char[] arr = new char[52];
        //随机抽取四次字符

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (97 + i);
            if (i < 26) {
                //添加小写字母
                arr[i] = (char) (97 + i);
            } else {
                //添加大写字母
                arr[i] = (char) (65 + i - 26);
            }
        }
        String result = "";
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(arr.length);
            result += arr[index];
        }
        int num = random.nextInt(10);
        result += num;
        System.out.println(result);
    }
    }




