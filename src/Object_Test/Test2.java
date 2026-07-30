package Object_Test;

public class Test2 {
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
        int index = getIndex(arr, 2);
        if (index != -1) {
            //遍历数组
            Student stu = arr[index];
            int newAge = stu.getAge() + 1;
            stu.setAge(newAge);
            printArr(arr);
        } else {
            System.out.println("删除失败");
        }

        arr[index] = null;
    }



        public static int getIndex (Student[]arr,int id){
            for (int i = 0; i < arr.length; i++) {
                Student stu = arr[i];
                if (stu != null) {
                    int sid = stu.getId();
                    if (sid == id) {
                        return i;
                    }
                }
            }
            return -1;
        }

        public static void printArr (Student[]arr){
            for (int i = 0; i < arr.length; i++) {
                Student stu = arr[i];
                if (stu != null) {
                    System.out.println(stu.getId() + " " + stu.getName() + " " + stu.getAge());
                }
            }
        }
    }

