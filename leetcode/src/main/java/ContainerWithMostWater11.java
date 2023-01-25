import java.util.PriorityQueue;

public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        int area = 1;
        int i = 0,j=height.length-1;
        while(i < j){
            area = Math.max(area,Math.min(height[i],height[j])*(j-i));
            if(height[i] >= height[j])
                j--;
            else
                i++;
        }
        return area;
    }
}
