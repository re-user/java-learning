package Object;

public class PhoneTest {
    static void main() {
        Phone [] arr = new Phone[3];

        Phone p1 = new Phone("小米",1999,"白色");
        Phone p2 = new Phone("华为",3999,"黑色");
        Phone p3 = new Phone("魅族",2999,"红色");
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           Phone p = arr[i];
           sum = sum + p.getPrice();
        }
int avg = sum / arr.length;
        System.out.println("平均价格为：" + avg);

    }
}
