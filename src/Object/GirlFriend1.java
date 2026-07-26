package Object;

public class GirlFriend1 {
    //属性
    private String name;
    private int age;
    private String gender;

    //针对每一个私有化的成员变量，都要提供get和set方法
    //set:给成员变量赋值
    //get：对外提供成员变量的值

    //作用：给成员变量name进行赋值的
    public void setName(String name) {
      //局部变量name和成员变量name重名，所以要使用this.成员变量名来访问成员变量name
        this.name = name;
    }

    //作用：对外提供成员变量name的值
    public String getName() {
        return name;
    }

    //age
    //setAge:给成员变量age进行赋值的
    //getAge:对外提供成员变量age的值
    public void setAge(int age) {
         if(age>=18 && age<=25) {
            this.age = age;
         }else{
             System.out.println("年龄范围错误");
         }
    }

    public int getAge() {
        return this.age;
    }

    //gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    //行为
    static void sleep() {
        System.out.println("女朋友在睡觉");
    }
    static void eat() {
        System.out.println("女朋友在吃饭");
    }
}
