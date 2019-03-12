public class Hero1 {

    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    //有参的构造方法
    //默认的无参的构造方法就失效了
    public Hero1(String heroname){
        name = heroname;
    }

    public static void main(String[] args) {
        Hero1 garen =  new Hero1("盖伦");

//        Hero1 teemo =  new Hero1(); //无参的构造方法“木有了”
    }

}