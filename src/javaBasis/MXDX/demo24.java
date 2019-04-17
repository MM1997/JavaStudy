package javaBasis.MXDX;

public class demo24 {
    public static void main(String[] args) {
        int[] a = new int[6];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);
        a[5] = (int) (Math.random() * 100);


        for (int i =0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }

        System.out.println();

        for (int j=0;j<a.length;j++){
            for (int i =0;i<a.length-j-1;i++){
                if (a[i]>a[i+1]){
                    int temp=a[i+1];
                    a[i+1]=a[i];
                    a[i]=temp;
                }
            }
        }
        for (int i =0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }

    }
}
