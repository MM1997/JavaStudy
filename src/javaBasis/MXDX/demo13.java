package javaBasis.MXDX;

public class demo13 {
    public static void main(String[] args) {
        /**
         * F 最终收入
         * P 本金
         * r 年利率
         * n 存了多少年
         */
        double r = 0.05,F=0,P=1000000,n=1;
        int end = 1000000;
        while (F<end){
            F=P*(1+r);
            P=F;
            n++;
            System.out.println((int) (n-1) + "年后,阿梅资产达到" + (int) F + "元");
        }

    }

}
