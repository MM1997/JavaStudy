package javaBasis.MXDX.test;

public class SingleTest {
    private static SingleTest instance;
    private SingleTest(){}
    public static synchronized SingleTest getInstance(){
        if (instance==null){
            instance=new SingleTest();
        }
        return instance;
    }
}
