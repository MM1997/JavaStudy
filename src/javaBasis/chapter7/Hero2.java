package javaBasis.chapter7;

public class Hero2 {
    String name;

    float hp;

    float moveSpeed;

    public Hero2(String heroname){
        name=heroname;
    }

    public Hero2(String heroname,float herohp){
        name=heroname;
        hp=herohp;
    }

    public static void main(String[] args){
        Hero2 garen = new Hero2("盖伦");
        Hero2 teemo = new Hero2("提莫",383);
    }
}
