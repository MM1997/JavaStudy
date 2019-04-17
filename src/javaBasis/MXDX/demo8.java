package javaBasis.MXDX;

import java.util.Scanner;

public class demo8 {
    public static void main(String[] args) {
        System.out.println("今天是周几？");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String b = a>5?"周末":"工作日";
        System.out.println("今天是"+b);
    }
}
