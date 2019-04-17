package javaBasis.MXDX;

import java.util.Scanner;

public class demo9 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = s.nextInt();
        String season;
        switch (month){
            case 1:
            case 2:
            case 3:
                season = "春季";
                break;
            case 4:
            case 5:
            case 6:
                season = "夏季";
                break;
            case 7:
            case 8:
            case 9:
                season="秋季";
                break;
            case 10:
            case 11:
            case 12:
                season="冬季";
                break;
            default:
                season="这是什么鬼";
        }
        System.out.println(season);
    }
}
