import java.util.Arrays;

public class MinimumDifferenceBetweenHighestandLowestofKScores1984 {
    public int minimumDifference(int[] nums, int k) {
        if(k==1) return 0;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i=k-1,j=0;i< nums.length;i++,j++){
            min = Math.min(min,nums[i]-nums[j]);
        }
        return min;
    }


}
