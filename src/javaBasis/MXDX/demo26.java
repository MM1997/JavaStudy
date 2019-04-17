package javaBasis.MXDX;

public class demo26 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,4,54,32,1};
        int[] b =new int[3];
        System.arraycopy(a,0,b,0,3);
        for (int each:b){
            System.out.println(each);
        }
    }
}
