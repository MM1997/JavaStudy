package javaBasis.MXDX;

import java.util.Arrays;

public class DEMO31 {
    public static void main(String[] args) {
        int[][] a = new int[5][8];
        System.out.println("输入原数组:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        int[] b = new int[a.length * a[0].length];

        for (int i = 0;i < a.length; i++) {
            System.arraycopy(a[i], 0, b, i * a[i].length, a[i].length);
        }

        Arrays.sort(b);

        for (int i = 0;i<a.length;i++){
                System.arraycopy(b,i*a[0].length,a[i],0,a[0].length);



        }

        System.out.println("输入顺序数组:");
        for (int[] row : a) {
            for (int each : row) {
                System.out.print(each + "\t");
            }
            System.out.println();
        }
    }
}