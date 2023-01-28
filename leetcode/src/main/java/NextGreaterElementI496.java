import java.util.Arrays;
import java.util.HashMap;

public class NextGreaterElementI496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Arrays.fill(res,-1);
        HashMap<Integer,Integer> temp = new HashMap<>();
        for (int i=0;i< nums2.length;i++){
            temp.put(nums2[i],i+1);
        }
        for (int i=0;i<nums1.length;i++){
            for (int j=temp.get(nums1[i]);j< nums2.length;j++){
                if(nums2[j] > nums1[i])
                {
                    res[i] = nums2[j];
                    break;
                }
            }
        }
        return res;
    }
}
