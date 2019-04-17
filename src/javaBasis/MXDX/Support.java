package javaBasis.MXDX;

public class Support extends Hero {
    public void heal(Hero...heroes){
        for (int i=0;i<heroes.length;i++) {
            heroes[i].hp += 100;
            System.out.println(name+"为"+heroes[i].name+"买了好看的衣服");
        }
    }

    public static void main(String[] args) {
        Support axiang=new Support();
        axiang.name="小阿香";
        Hero amei=new Hero();
        amei.name="小阿梅";
        axiang.heal(amei);
    }
}
