public class SubarraySumEqualsK560 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        for (int i=0,j=0;i< nums.length;i++){
            sum += nums[i];
            if(sum == k){
                sum = 0;
                count++;
            }else if(sum>k){
                while (sum > k){
                    sum -= nums[j++];
                }
                i--;
            }
        }
        return count;
    }
}
