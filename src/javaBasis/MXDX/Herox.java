package javaBasis.MXDX;

public class Herox {
    public String name;//姓名

    public static void main(String[] args) {

        HeroType type=HeroType.ASSASSIN;
        switch (type){
            case TANK:
                System.out.println("坦克");
                break;
            case ASSASSIN:
                System.out.println("刺客");
        }
    }
}
