package javaBasis.MXDX;

public class demo21 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0]=(int)(Math.random()*100);
        a[1]=(int)(Math.random()*100);
        a[2]=(int)(Math.random()*100);
        a[3]=(int)(Math.random()*100);
        a[4]=(int)(Math.random()*100);
        for (int i =0;i<5;i++){
            System.out.print(a[i]+",");
        }
        System.out.println();
        for (int n =4;n>=0;n--){
            System.out.print(a[n]+",");
        }
    }


}
