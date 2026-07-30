package Object_Test;

public class Test {
    public static void main(String[] args) {
        //1.创建一个数组来存储学生对象
        Student[] arr = new Student[3];
        //2.创建学生对象
        Student stu1 = new Student(1, "张三", 18);
        Student stu2 = new Student(2, "李四", 19);
        Student stu3 = new Student(3, "王五", 20);
        //3.将学生对象存储到数组中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //再次添加一个学生对象
        Student stu4 = new Student(4, "赵六", 21);

        //对添加的学生对象进行唯一性判断

        //不存在----添加
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            //已存在----不添加
            System.out.println("该学生已存在");
        } else {

            //将学生对象添加到数组中
            //数组的长度不足，创建新的数组来储存学生对象
            //数组长度足够
            int count = getCount(arr);
            if (count == arr.length) {
                //存满了
                Student[] newArr = CreatNewArr(arr);
                newArr[count] = stu4;
                printArr(newArr);
            } else {
                //没有存满
                arr[count] = stu4;
                printArr(arr);
            }
        }


        //4.将学生对象存储到数组中
        //如果数组的长度不足，创建新的数组来储存学生对象

        Student[] newArr = new Student[arr.length + 1];


    }

    public static Student[] CreatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];

        }

        return newArr;
    }
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
           Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId() + " " + stu.getName() + " " + stu.getAge());
            }
        }
    }


    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
                //依次获取数组中每一个学生对象
                Student stu = arr[i];
                if (stu != null) {
                    //获取数组中存储的学生对象的id值
                    int sid = stu.getId();
                    //判断数组中存储的学生对象的id值是否与要添加的学生对象的id值相同
                    if (sid == id) {
                        return true;
                    }
                }
            }
        return false;
    }

    //定义一个方法判断数组中有几个元素
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }
}
