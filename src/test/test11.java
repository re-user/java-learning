package test;

import java.util.Scanner;

public class test11 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的价格");
        int price = sc.nextInt();
        System.out.println("请输入当前的月份");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位，0表示头等舱，1表示经济舱");
        int seat = sc.nextInt();
        if (month >= 5 && month <= 10) {
            price = money(price, seat, 0.9, 0.85);
            System.out.println("您的价格为：" + price);
        }else if((month >= 1 && month <= 4) || (month >= 11 && month <= 12)){
            price = money(price, seat, 0.7, 0.65);
            System.out.println("您的价格为：" + price);
        }
    }

    static int money(int price, int seat, double vo, double v1) {
        if (seat == 0) {
            price = (int) (price * vo);
        } else if (seat == 1) {
            price = (int) (price * v1);

        } else {
            System.out.println("没有这个位置");
        }
        return price;
    }
}



