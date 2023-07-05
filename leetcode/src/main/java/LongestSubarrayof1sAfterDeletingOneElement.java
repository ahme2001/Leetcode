import java.util.*;

public class LongestSubarrayof1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int i=0;
        while(i < nums.length && nums[i] != 1)
            i++;
        int t = 1,count=0,start = i;
        for(;i<nums.length;i++){
            if(nums[i] != t){
                t = nums[i];
                res.add(count);
                count = 1;
                continue;
            }
            count++;
        }
        res.add(count);
        if(count == nums.length) return count-1;
        if(count == nums.length-start) return count;
        int max = 0;
        for(int j=0;j<res.size();){
            if(j+1 < res.size() && res.get(j+1) == 1){
                count = (j+2<res.size()?res.get(j+2):0) + res.get(j);
                max = Math.max(max,count);
            }else if(j+1 < res.size() && res.get(j+1) > 1){
                count = Math.max((j+2<res.size()?res.get(j+2):0),res.get(j));
                max = Math.max(max,count);
            }
            j += 2;
        }

        return max;
    }
}
