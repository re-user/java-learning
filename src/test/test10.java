package test;

public class test10 {
    static void main() {
        /*给定两个整数，被除数和除数（都是正数，且不超过int范围），将两数相除，需求不使用乘法，除法和取余运算符，得到商和余数*/
        int a = 6;
        int b = 3;
        int shang = 0;
        int yu = a;
        while(a>=b){
            a=a-b;
            shang++;
            yu=a;
        }
        System.out.println("商为"+shang);
        System.out.println("余数为"+yu);
    }
}
