import java.util.HashMap;

public class LongestConsecutiveSequence128 {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> temp = new HashMap<>();
        int count =0;
        for (int num : nums) {
            temp.put(num,num+1);
        }
        for (int num: nums){
            if(temp.containsKey(num-1)) continue;
            boolean flag = true;
            int counter = 0;
            while(flag){
                if(temp.containsKey(num++)) {
                    counter++;
                }
                else
                    flag = false;
            }
            count = Math.max(count,counter);
        }
        return count;
    }

}

