package test;

public class MethodTest4 {
    static void main() {
        compare(1, 2);
        //compare((byte)1, (byte)2);
        //compare((long)1, (long)2);
    }

    static void compare(double b1, double b2) {
        System.out.println("double类型");
        System.out.println(b1 == b2);
    }

    static void compare(int i1, int i2) {
        System.out.println("int类型");
        System.out.println(i1 == i2);
    }

    static void compare(byte b1, byte b2) {
        System.out.println("byte类型");
        System.out.println(b1 == b2);
    }

    static  void compare(long l1, long l2) {
        System.out.println("long类型");
        System.out.println(l1 == l2);
    }
}

