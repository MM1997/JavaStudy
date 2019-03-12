package javaBasis.chapter7;

public class gouzaofangfa_test {
    String name;
    float hP;
    float armor;
    int moveSpeed;

    public gouzaofangfa_test(String heroName) {
        name = heroName;
    }

    public gouzaofangfa_test(String heroName, float heroHP) {
        name = heroName;
        hP = heroHP;
    }

    public gouzaofangfa_test(String heroName, float heroHP, float heroArmor) {
        name = heroName;
        hP = heroHP;
        armor = heroArmor;
    }

    public gouzaofangfa_test(String heroName, float heroHP, float heroArmor, int heroMoveSpeed) {
        name = heroName;
        hP = heroHP;
        armor = heroArmor;
        moveSpeed = heroMoveSpeed;
    }

    public static void main(String[] args) {
        gouzaofangfa_test garen = new gouzaofangfa_test("盖伦");
        gouzaofangfa_test teemo = new gouzaofangfa_test("提莫", 384);
        gouzaofangfa_test db = new gouzaofangfa_test("死哥", 400, 27, 380);

    }
}
