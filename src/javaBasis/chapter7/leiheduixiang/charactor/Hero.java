package javaBasis.chapter7.leiheduixiang.charactor;

public class Hero {
    /**
     * 声明该属性的时候初始化
     */
    public String name=Hero.getName("属性声明");

    public Hero(){
//        构造方法中初始化块
        name = Hero.getName("构造方法");
    }
    {
//        初始化块
        name = Hero.getName("初始化块");
    }

    public static String getName(String pos) {
        String result ="name" +pos;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Hero h = new Hero();
    }
}
