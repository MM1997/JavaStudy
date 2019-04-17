package javaBasis.MXDX;

public class demo23 {
    public static void main(String[] args) {
        int[] a =new int[6];
        a[0]=(int)(Math.random()*100);
        a[1]=(int)(Math.random()*100);
        a[2]=(int)(Math.random()*100);
        a[3]=(int)(Math.random()*100);
        a[4]=(int)(Math.random()*100);
        a[5]=(int)(Math.random()*100);
        System.out.println("打印原始数组:");
        for (int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
//        选择法排序
//        如果发现其他位置的数据比第一位小,就进行交换

        for (int j=0;j<a.length-1;j++){
            for(int i=j+1;i<a.length;i++){
                if (a[i]<a[j]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }

        for (int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
