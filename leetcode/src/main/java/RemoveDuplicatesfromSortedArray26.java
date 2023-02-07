public class RemoveDuplicatesfromSortedArray26 {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1,count=0,q= nums.length;
        while (i< nums.length && j< nums.length) {
            if (nums[i] == nums[j]) {
                q--;
            }else{
                nums[count] = nums[i];
                count++;
            }
            i++;j++;
        }
        if(count < nums.length)
            nums[count] = nums[j-1];
        return q;
    }
}
