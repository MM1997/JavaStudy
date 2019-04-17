package javaBasis.MXDX;

public class demo29 {
    public static void main(String[] args) {
        int a[][] = new int[5][5];
        // 初始化这个数组
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
        // 打印这个数组的内容：
        for (int[] row : a) {
            for (int each : row) {
                System.out.print(each + "\t");
            }
            System.out.println();
        }

    }
}
