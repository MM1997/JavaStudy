package javaBasis.chapter7.leiheduixiang.charactor;

public class Support extends Hero implements Healer {
    @Override
    public void heal(){
        System.out.println(name+"加了一口血");
    }
}
