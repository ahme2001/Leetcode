import java.util.HashMap;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 2 ){
            return new int[]{0,1};
        }
        int diff;
        int[] res;
        res = new int[2];
        HashMap<Integer,Integer> temp = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            temp.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
            diff = target - nums[i];
            if (temp.containsKey(diff)){
                res[0] = i;
                res[1] = temp.get(diff);
                if(res[0] != res[1])
                    break;
            }
        }
        return res;
    }
}
