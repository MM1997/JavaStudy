package javaBasis.MXDX;

public class demo25 {
    public static void main(String[] args) {
        int values[] = new int[6];
        values[0]=(int)(Math.random()*100);
        values[1]=(int)(Math.random()*100);
        values[2]=(int)(Math.random()*100);
        values[3]=(int)(Math.random()*100);
        values[4]=(int)(Math.random()*100);
        values[5]=(int)(Math.random()*100);
        for (int each:values){
            System.out.print(each+" ");
        }
        System.out.println();


        int max=0;
        for (int each:values){
            if (each>max){
                max=each;
            }
        }
        System.out.println(max);

    }
}
