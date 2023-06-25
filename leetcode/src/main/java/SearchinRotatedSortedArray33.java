public class SearchinRotatedSortedArray33 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = (left+right)/2;
        int difleft,difright;
        while(left <= right){
            // System.out.println(nums[mid] + " " + target + " " + left + " " + mid + " " + right);
            if(nums[mid] == target) return mid;
            if(nums[left] == target) return left;
            if(nums[right] == target) return right;

            difleft = Math.abs(target - nums[left]);
            difright = Math.abs(target - nums[right]);
            if(difleft == difright) break;
            if(nums[mid] >= nums[left] && nums[mid] >= nums[right]){
                if(difleft < difright && nums[mid] > target)
                    right = mid - 1;
                else
                    left = mid + 1;
            }else if(nums[mid] < nums[left] && nums[mid] < nums[right]){
                if(difleft > difright && nums[mid] < target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }else if(nums[mid] >= nums[left] && nums[mid] < nums[right]){
                if(nums[mid] > target)
                    right = mid - 1;
                else
                    left = mid + 1;
            }else if(nums[mid] < nums[left] && nums[mid] >= nums[right])
                return -1;
            mid = (left+right)/2;
        }
        return -1;
    }
}
