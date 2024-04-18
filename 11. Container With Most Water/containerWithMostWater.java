public class containerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int res = 0;
        while(j>i){
            int h = Math.min(height[i], height[j]);
            int area = (j-i) * h;
            if(area > res){
                res = area;
            }
            if(height[i] > h){
                j--;
            }
            else{
                i++;
            }
        }
        return res;
    }
}
