package Object;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String[] boyface ={"气宇轩昂","英俊潇洒","相貌平平"};
    String[] girlface ={"成鱼落雁","亭亭玉立","婀娜多姿"};
    String [] attack_desc = {
            "%s使出一招【背心钉】，绕到对方后面，一拳给向%s背心的灵台穴拍去。",
            "%s使出一招【游空探抓】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【霹雷坠地】，垂向%s。"};
    String []injured_desc = {
            "结果%s退了半步，毫发无伤",
            "结果给%s造成了一处瘀伤",
            "结果给%s一击命中，%s疼的弯下了腰"};


    //空参构造方法
    public Role() {

    }

    //带全部参数的构造方法
    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        if (gender=='男') {
           int index = r.nextInt(boyface.length);
           this.face = boyface[index];
        }else if(gender=='女'){
            int index = r.nextInt(girlface.length);
            this.face = girlface[index];
        }else{
            this.face = ("惨不忍睹");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role role) {


        Random r = new Random();
        int index = r.nextInt(attack_desc.length);
        String KunFu = attack_desc[index];
        System.out.printf(KunFu,this.getName(),role.getName());
        //计算造成的伤害
        int damage = r.nextInt(1, 20);

        //修改目标角色的血量
        int remainBlood = role.getBlood() - damage;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);

        //打印伤害描述,血量变化
        System.out.printf(injured_desc[index],this.getName(),role.getName(),damage,remainBlood);
        System.out.println();
    }
    public void showInfo(){
        System.out.println("姓名为"+this.getName());
        System.out.println("性别为"+this.getGender());
        System.out.println("外观为"+this.getFace());
        System.out.println("血量为"+this.getBlood());
    }
}
