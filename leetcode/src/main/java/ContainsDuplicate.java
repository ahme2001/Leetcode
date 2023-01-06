import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> temp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if (temp.containsKey(nums[i]))
                return true;
            temp.put(nums[i],1);
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
