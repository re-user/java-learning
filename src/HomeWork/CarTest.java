package HomeWork;

import java.util.Scanner;

public class CarTest {
    static void main() {
        Scanner sc = new Scanner(System.in);

        Car [] arr = new Car[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i+1) + "辆车车的信息：");
            String brand = sc.next();
            System.out.println("请输入第" + (i+1) + "辆车车价格：");
            double price = sc.nextDouble();
            System.out.println("请输入第" + (i+1) + "辆车车颜色：");
            String color = sc.next();
            Car car = new Car(brand, price, color);
            arr[i] = car;
        }
        System.out.println("车的信息如下：");
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand() + " " + car.getPrice() + " " + car.getColor());
        }
    }
}
