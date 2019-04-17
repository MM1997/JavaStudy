package javaBasis.InterfaceStudy;

public class Support implements Healer{
    String name;
    @Override
    public void heal(){
        System.out.println(name+"加了一口血");
    }


}
