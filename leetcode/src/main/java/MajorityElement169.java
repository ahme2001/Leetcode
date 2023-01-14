import java.util.HashMap;

public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> store = new HashMap<>();
        int max = nums.length/2,i=-1;
        for (int num : nums) {
            int t = store.getOrDefault(num, 0);
            store.put(num, t + 1);
            if((t+1) > max)
            {
                max = t+1;
                i=num;
            }
        }
        return i;
    }
}
