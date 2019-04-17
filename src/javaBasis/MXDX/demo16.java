package javaBasis.MXDX;

public class demo16 {


    public static void main(String[] args) {
        /**
         * 3位数
         * 每一位的立方,加起来等于这个数本身
         */
        int range = 1000;
        int gewei, shiwei, baiwei;
        int x,sum;

        for (x=100;x<range;x++){
            baiwei=x/100;
            gewei=x%10;
            shiwei=(x-baiwei*100)/10;
            sum = (gewei*gewei*gewei)+(baiwei*baiwei*baiwei)+(shiwei*shiwei*shiwei);
            if (sum==x){
                System.out.println(x+"是水仙花数");
            }
        }
    }
}


