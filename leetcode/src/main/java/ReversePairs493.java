import java.util.ArrayList;
import java.util.List;

public class ReversePairs493 {
    public int reversePairs(int[] nums) {
        return merge_sort(nums,0,nums.length-1);
    }

    private int merge(int[] array,int start,int mid,int end){
        int count = 0;
        int j = mid+1;
        for (int i=start;i<=mid;i++){
            while (j<=end && array[i] > (2*(long)array[j])) j++;
            count += j - (mid+1);
        }

        List<Integer> list = new ArrayList<>();
        int i = start;
        j = mid+1;

        while (i <= mid && j <= end){
            if (array[i] < array[j]) list.add(array[i++]);
            else list.add(array[j++]);
        }

        while (i <= mid) list.add(array[i++]);
        while (j <= end) list.add(array[j++]);

        for (int x=start;x<=end;x++){
            array[x] = list.get(x-start);
        }
        return count;
    }

    private int merge_sort(int[] array, int start, int end)
    {
        int countingInversions = 0;
        if (start < end) {
            int mid = start + (end - start) / 2;

            countingInversions += merge_sort(array, start, mid) ;
            countingInversions += merge_sort(array, mid + 1, end);

            countingInversions += merge(array, start, mid, end);
            return countingInversions;
        }
        return 0;
    }
}
