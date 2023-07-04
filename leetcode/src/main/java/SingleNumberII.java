import java.util.*;

public class SingleNumberII {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> temp = new HashMap<>();
        for (int num : nums) {
            temp.put(num, temp.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : temp.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
