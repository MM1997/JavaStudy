package javaBasis.chapter7;

public class Armor extends Item {
    int ac;

    public static void main(String[] args) {
        Armor hujia1 = new Armor();
        Armor huajia2=new Armor();
        hujia1.name="布甲";
        hujia1.price=300;
        hujia1.ac=15;
        huajia2.name="锁子甲";
        huajia2.price=500;
        huajia2.ac=40;
    }
}
