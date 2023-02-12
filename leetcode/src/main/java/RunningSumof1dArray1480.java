public class RunningSumof1dArray1480 {
    public int[] runningSum(int[] nums) {
        int sum = nums[0],n= nums.length;
        int[] res = new int[n];
        for (int i=0;i<n-1;){
            res[i] = sum;
            sum += nums[++i];
        }
        res[n-1] = sum;
        return res;
    }
}
