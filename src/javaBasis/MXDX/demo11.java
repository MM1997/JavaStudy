package javaBasis.MXDX;

public class demo11 {
    public static void main(String[] args) {

        int moneyEachDay = 0;
        int day = 30;
        int sum = 0;
        for (int i = 1; i <= day; i++) {
            if (0 == moneyEachDay) {
                moneyEachDay = 1;
            } else {
                moneyEachDay *= 2;
            }
            sum += moneyEachDay;
            System.out.println(i+"天之后，洪帮主手中的总钱数是"+sum);
        }
    }
}
