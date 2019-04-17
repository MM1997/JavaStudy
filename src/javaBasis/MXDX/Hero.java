package javaBasis.MXDX;

public class Hero {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    //坑队友
    void keng(){
        System.out.println("坑队友！");
    }

    //获取护甲值
    float getArmor(){
        return armor;
    }

    //增加移动速度
    void addSpeed(int speed){
        //在原来的基础上增加移动速度
        moveSpeed = moveSpeed + speed;
    }

    //超神
    void legendary(){
        System.out.println("超神了！");
    }

    //获取当前的血量
    float getHp(){
        return hp;
    }

    //回血
    void recovery(float blood){
        hp = hp+blood;
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name= "盖伦";
        garen.hp  = 500;
        System.out.println(garen.name + " 当前的血量是 " +garen.hp);
        System.out.println(garen.getHp());
        System.out.println("回血100");
        garen.recovery(100);
        System.out.println("现在的血量是:" + garen.hp);
    }

}