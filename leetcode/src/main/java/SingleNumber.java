import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> x = new HashMap<>();
        for (int j : nums) {
            x.put(j, x.getOrDefault(j, 0) + 1);
        }
        int num = nums[0];
        for(Map.Entry<Integer, Integer> map : x.entrySet()){
            if(map.getValue() == 1) {
                num = map.getKey();
                break;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,2,1,2,1}));
    }
}
