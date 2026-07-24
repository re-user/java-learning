package test;

import java.util.Scanner;

public class test15 {
    static void main() {
        int[] scores = getscores();
        int max = getmax(scores);
        System.out.println("最高分是：" + max);
        int min = getmin(scores);
        System.out.println("最低分是：" + min);
        int sum = getsum(scores);
        int avg =  (sum - max - min) / (scores.length - 2);
        System.out.println("平均分是：" + avg);
    }

    static int getmax(int[] scores) {
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }
    static int getmin(int[] scores) {
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }
    static int getsum(int[] scores) {
        int s = 0;
        for (int i = 0; i < scores.length; i++) {
            s += scores[i];
        }
        return s;
    }

    static int[] getscores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入评委的打分");
            int score = sc.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("请输入正确的打分");
                i--;
                continue;
            }
            scores[i] = score;
        }
        return scores;
    }
}
