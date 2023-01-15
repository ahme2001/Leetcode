import java.util.*;

public class FindAllNumbersDisappearedinanArray448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        int[] temp = new int[n];
        Arrays.fill(temp,0);
        for (int num:nums){
            temp[num]++;
        }
        for (int i=0;i<temp.length;i++){
            if (temp[i] == 0)
                res.add(i);
        }
        return res;
    }
}
