import java.util.HashMap;

public class maxAreaOfCake {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        int HMax = 0, VMax = 0;
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int pointer = 0;
        for(int cut: verticalCuts){
            VMax = Math.max(VMax, cut - pointer);
            pointer = cut;
        }
        VMax = Math.max(VMax, w - pointer);

        pointer = 0;
        for(int cut: horizontalCuts){
            HMax = Math.max(HMax, cut - pointer);
            pointer = cut;
        }
        HMax = Math.max(HMax, h - pointer);

        return (int) (((long) VMax * HMax)%1000000007);
    }
}
