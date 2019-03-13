package javaBasis.chapter7.leiheduixiang.property;

import javaBasis.chapter7.leiheduixiang.charactor.Hero;

public class support extends Hero {
    public void heal() {
        System.out.println("对自己进行治疗");
    }

    public void heal(Hero hero) {
        System.out.println("给英雄 " + hero + " 加血");
    }

    public void heal(Hero hero, int hp) {
        System.out.println("给英雄 " + hero + " 加了 " + hp + "点血");
    }


    public static void main(String[] args) {
        support teemo = new support();
        teemo.name="提莫";
        teemo.hp=43;
    }
}
