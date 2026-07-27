package Object;

public class GameTest {
    static void main() {
        Role role1 = new Role("张三", 100,'男');
        Role role2 = new Role("李四", 100,'女');
        role1.showInfo();
        role2.showInfo();

        while (true) {
            role1.attack(role2);
            if (role2.getBlood() == 0) {
                System.out.println(role1.getName() + "KO了"+role2.getName());
                break;
            }

            role2.attack(role1);
            if (role1.getBlood() == 0) {
                System.out.println(role2.getName() + "KO了"+role1.getName());
                break;
            }
        }

    }
}
