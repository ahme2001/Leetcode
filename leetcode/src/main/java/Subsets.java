import java.util.*;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        sub(nums,new ArrayList<>(),res,0);
        return res;
    }
    private void sub(int[] nums,List<Integer> list,List<List<Integer>> res,int start){
        res.add(new ArrayList<>(list));
        for(int i=start;i<nums.length;i++){
            list.add(nums[i]);
            sub(nums,list,res,i+1);
            list.remove(list.size() - 1);
        }
    }
}
