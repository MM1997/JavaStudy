package javaBasis.MXDX;

import java.lang.reflect.Array;
import java.util.Arrays;

public class demo30 {
    public static void main(String[] args) {
        int[] a = new int[]{18, 62, 68, 82, 65, 9};

        Arrays.sort(a);
        System.out.print(Arrays.toString(a));
        int b=Arrays.binarySearch(a,82);
        System.out.println(b);
    }
}
