package javaBasis.MXDX;

import java.util.Scanner;

public class demo10 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int fac = 1;
        while (N>=1){
            fac *=N;
            N--;
        }
        System.out.println("阶乘是："+fac);
    }
}
