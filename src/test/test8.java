package test;

public class test8 {
    static void main() {
        /*假如我有一张足够大的纸，我用0.1毫米的纸，，问我最多可以折多少次，可以折叠成珠穆朗玛峰的高度*/
        double height = 0.1;
        int count = 0;
        while (height <= 8844430) {
            height = height * 2;
            count++;
        }
        System.out.println(count);
    }
}
