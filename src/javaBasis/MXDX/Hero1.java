package javaBasis.MXDX;

public class Hero1 {
    String name;
    float hp,armor;
    int movespeed;
    public Hero1(String heroName){
        name=heroName;
    }
    public Hero1(float heroHp){
        hp=heroHp;
    }
    public Hero1(float heroHp,float heroArmor){
        hp=heroHp;
        armor=heroArmor;
    }
    public  Hero1(int heroMoveSpeed){
        movespeed=heroMoveSpeed;
    }

    public static void main(String[] args) {
        Hero1 garen=new Hero1("盖伦");
        Hero1 garen1=new Hero1(30f);
        Hero1 garen2=new Hero1(30f,40f);
        Hero1 garen3=new Hero1(40);
    }
}
