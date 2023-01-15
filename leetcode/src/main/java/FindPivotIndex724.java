public class FindPivotIndex724 {
    public int pivotIndex(int[] nums) {
        int leftSum=0,rightSum=0;
        for (int num: nums){
            leftSum += num;
        }
        for (int i=0;i< nums.length;i++){
            leftSum -= nums[i];
            if (leftSum == rightSum)
                return i;
            rightSum += nums[i];
        }
        return -1;
    }
}
