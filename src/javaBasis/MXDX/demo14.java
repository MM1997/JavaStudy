package javaBasis.MXDX;

public class demo14 {

    public static void main(String[] args) {

/**     寻找某两个数相除，其结果离黄金分割点0.618最近
 分母和分子不能同时为偶数
 分母和分子取值范围在[1,20]

 */
//        取值范围
        int range = 20;
//        黄金分割点
        float breakPoint = 0.618f;

//        离黄金分割的的差值
        float minDiff = 100;
//        找到的分子
        float answerFenzi = 0;
//        找到的分母
        float answerFenmu = 0;

        for (int fenzi = 1; fenzi <= range; fenzi++) {
            for (int fenmu = 1; fenmu <= range; fenmu++) {
//                分母和分子不能同时为偶数
                if (0 == fenzi % 2 & 0 == fenmu % 2) {
                    continue;
                }
//                取值
                float value = (float) fenzi / fenmu;
//                取离黄金分割点的差值
                float diff = value - breakPoint;
//                绝对值
                diff = diff < 0 ? 1 - diff : diff;

//                找出最小的差值
                if (diff < minDiff) {
                    minDiff = diff;
                    answerFenzi = fenzi;
                    answerFenmu = fenmu;

                }
            }
        }
        System.out.println("离黄金分割点(" + breakPoint + ")最近的两个数相除是:" + answerFenzi + "/" + answerFenmu + "="
                + ((float) answerFenzi / answerFenmu));
    }
}
