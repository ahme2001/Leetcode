import java.util.Arrays;

public class NumberofSubsequencesThatSatisfytheGivenSumCondition1498 {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        double count=0;
        while (i<j){
            if((nums[i]+nums[j])<= target)
                break;
            j--;
        }
        int temp = j;
        count = Math.pow(2,(j-i));
        System.out.println("c" + count);
        while (j>i) {
            if(nums[j]*2 > target)
                count--;
            else
                break;
            j--;
        }
        System.out.println("c2" + count);
        while (i<temp){
            if((nums[i]+nums[temp])<=target)
                i++;
            else
                break;
        }
        count -= Math.pow(2,(temp-i));
        System.out.println("count " + count);
        int res = (int) (count % (10^9 + 7));
        return res;
    }
}
