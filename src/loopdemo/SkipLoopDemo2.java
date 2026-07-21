package loopdemo;
public class SkipLoopDemo2 {
    static void main() {
        for (int i = 1;i<=10;i++){
            if (i==3){
                break;
            }
            System.out.println("小老虎在吃第"+i+"个包子");
        }
    }
}
