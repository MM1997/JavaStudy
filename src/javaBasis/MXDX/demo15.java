package javaBasis.MXDX;

public class demo15 {
    public static void main(String[] args) {
        int answerfenzi=1,answerfenmu=1;
        float fenge=0.618f,diff=100,diff1;
        int range=20;
        for (int fenzi=1;fenzi<=range;fenzi++){
            for (int fenmu=1;fenmu<=range;fenmu++){
                if (0==fenzi%2&0==fenmu%2){
                    continue;
                }
                diff1=fenge-(float)fenzi/fenmu>0?fenge-fenzi/fenmu:fenzi/fenmu-fenge;
                if(diff1<diff){
                    diff=diff1;
                    answerfenmu=fenmu;
                    answerfenzi=fenzi;
                }
            }
        }
        System.out.println(answerfenmu+"分母是"+answerfenzi);
    }
}
