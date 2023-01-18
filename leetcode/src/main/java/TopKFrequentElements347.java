import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Step{
    int data;
    int freq;
}

class Sortbyfreq implements Comparator<Step> {
    public int compare(Step a, Step b)
    {
        return b.freq - a.freq;
    }
}

public class TopKFrequentElements347 {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 1)
            return nums;
        int[] res = new int[k];
        ArrayList<Step> temp = new ArrayList<>();
        int count=1;
        Arrays.sort(nums);
        for (int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                Step te = new Step();
                te.data = nums[i-1];
                te.freq = count;
                temp.add(te);
                count = 1;
                continue;
            }
            count++;
        }
        Step te = new Step();
        te.data = nums[nums.length-1];
        te.freq = count;
        temp.add(te);
        temp.sort(new Sortbyfreq());

        for (int i=0;i<k;i++){
            res[i] = temp.get(i).data;
        }
        return res;
    }

}
