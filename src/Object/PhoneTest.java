package Object;

public class PhoneTest {
    static void main(String[] args) {
        //创建手机的对象
        Phone p = new Phone();

        //给手机赋值
        p.brand = "小米";
        p.price = 2999.98;

        //获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用手机中的方法
        p.call();
        p.playgame();

        //创建第二个手机的对象
        Phone p2 = new Phone();
        p2.brand = "华为";
        p2.price = 3999.98;
        p2.call();
        p2.playgame();

    }
}
