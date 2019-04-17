package javaBasis.MXDX;

public class demo28 {
    public static void main(String[] args) {
        int a[][] = new int[5][5];
        int max = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = (int) (Math.random() * 100);
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        for (int[] each : a) {
            for (int each1 : each) {
                System.out.print(each1 + "\t");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println(max);
    }
}
