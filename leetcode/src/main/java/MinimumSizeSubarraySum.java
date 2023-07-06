public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length == 1)
            return (target == nums[0])?1:0;
        int targetVal = 0;
        int i = 0,res =nums.length+1;
        for(int k=0;k<nums.length;k++){
            targetVal += nums[k];
            while (targetVal >= target) {
                res = Math.min(res, k - i+1);
                targetVal -= nums[i++];
            }
        }
        return (res == nums.length+1)?0:res;
    }
}
