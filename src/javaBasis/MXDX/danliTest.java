package javaBasis.MXDX;

public class danliTest {
    private danliTest(){
        System.out.println("测试单例模式");
    };

    private static danliTest instance=new danliTest();

    public static danliTest getInstance(){
        return instance;
    }
}
