package javaBasis.MXDX;

public class demo27 {
    public static void main(String[] args) {
        int a = (int)(Math.random()*100);
        int b =(int)(Math.random()*100);
        int[] shuzuA=new int[a];
        int[] shuzuB=new int[b];
        for (int i =0;i<a;i++){
            shuzuA[i]=(int)(Math.random()*100);
        }
        for (int i =0;i<b;i++){
            shuzuB[i]=(int)(Math.random()*100);
        }
        int c=a+b;
        int[] shuzuC = new int[c];
        System.arraycopy(shuzuA,0,shuzuC,0,a);
        System.arraycopy(shuzuB,0,shuzuC,a,b);
        for (int each:shuzuA){
            System.out.print(each+" ");
        }
        System.out.println();
        for (int each:shuzuC){
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println(b);
        for (int i =0;i<b;i++){
            System.out.print(shuzuB[i]+" ");
        }
        for (int each:shuzuB){
            System.out.print(each+" ");
        }
        System.out.println();
    }
}
