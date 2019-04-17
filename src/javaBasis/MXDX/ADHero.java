package javaBasis.MXDX;

public class ADHero extends Hero {

    public void attack(){
        System.out.println(name+"进行一次攻击,但是不确定打中谁了。");
    }

    //可变数量的参数
    public void attack(Hero...heroes){
        for (int i=0;i<heroes.length;i++){
            System.out.println(name+"攻击了"+heroes[i].name);
        }
    }

    public static void main(String[] args) {
        ADHero jack=new ADHero();
        jack.name="小阿香";
        Hero jack1=new ADHero();
        jack1.name="小阿梅";


        jack.attack(jack1);
    }

}
