import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class IntersectionofTwoArraysII350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Queue<Integer> temp = new LinkedList<>();
        HashMap<Integer,Integer> inters = new HashMap<>();
        for (int num:nums1){
            inters.put(num,inters.getOrDefault(num,0)+1);
        }
        for(int num:nums2){
            if(inters.containsKey(num)) {
                int t = inters.get(num);
                inters.put(num, t - 1);
                if(t>0)
                    temp.add(num);
            }
        }

        int count = 0;
        int[] res = new int[temp.size()];
        while (!temp.isEmpty())
            res[count++] = temp.poll();

        return res;
    }
}
