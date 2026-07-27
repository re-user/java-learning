package Object;

import java.util.Scanner;

public class CarTest {
    static void main() {
        //创建一个数组用来储存三个汽车对象
        Car[] arr = new Car[3];
        //创建汽车对象，数据来自键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车对象
            Car c =new Car();
            //录入品牌
            System.out.println("请输入品牌");
            String brand = sc.next();
            c.setBrand(brand);
            //录入价格
            System.out.println("请输入价格");
            int price = sc.nextInt();
            c.setPrice(price);
            //录入颜色
            System.out.println("请输入颜色");
            String color = sc.next();
            c.setColor(color);
            //将汽车对象存储到数组中
            arr[i] = c;
        }
        //遍历数组，输出汽车信息
        for (int i = 0; i < arr.length; i++) {
            Car c = arr[i];
            System.out.println(c.getBrand() + " " + c.getPrice() + " " + c.getColor());
        }
    }
}
