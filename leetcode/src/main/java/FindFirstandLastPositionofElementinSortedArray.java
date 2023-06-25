public class FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1,-1};
        int left = 0;
        int right = nums.length - 1;
        int mid = (left+right)/2;
        while(left <= right){
            if(nums[mid] == target){
                int[] num = new int[2];
                int i = mid;
                while(i>=0 && nums[i] == target)
                    i--;
                num[0] = i+1;
                i = mid;
                while(i<nums.length && nums[i] == target)
                    i++;
                num[1] = i-1;
                return num;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
            mid = (left+right)/2;
        }
        return new int[]{-1,-1};
    }
}
