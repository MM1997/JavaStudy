package javaBasis.MXDX;

public class Item {
    String name;
    int price;
    float Hp;

    private  Item(){
        System.out.println("test");
    };

    private static Item instance=new Item();

    public static Item getinstance(){
        return instance;
    }

    void legendary(){
        System.out.println("超神");
    }

    float getHp(){
        return Hp;
    }

    void recovery(float blood){

    }


}
