import java.util.*;

public class Sum15 {
    public List<List<Integer>> twoSum(int[] nums, int target,int pos) {
        Set<String> e = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        int start = pos+1,end = nums.length-1;
        while (start < end){
            int sum = nums[start]+nums[end];
            if(sum==target){
                List<Integer> temp2 = new ArrayList<>();
                temp2.add(nums[pos]);
                temp2.add(nums[start]);
                temp2.add(nums[end]);
                res.add(temp2);
            }
            if (sum > target) {
                end--;
            } else {
                start++;
                while (nums[start] == nums[start-1] && (start < end)) {
                    start++;
                }
            }
        }
        return res;
    }
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<n;i++){
            if(((i!=0) && (nums[i] == nums[i-1]))) continue;
            List<List<Integer>> temp;
            temp = twoSum(nums,nums[i]*-1,i);
            if (!temp.isEmpty()) res.addAll(temp);
        }
        return res;
    }

}
