public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[n+m];
        int i=0,j=0,count=0;
        while (i<m && j < n) {
            if(nums1[i] < nums2[j]){
                nums3[count++] = nums1[i];
                i++;
            }else if(nums1[i] > nums2[j]){
                nums3[count++] = nums2[j];
                j++;
            }else{
                nums3[count++] = nums2[j];
                nums3[count++] = nums1[i];
                i++;
                j++;
            }
        }
        while (i<m)
            nums3[count++] = nums1[i++];
        while (j<n)
            nums3[count++] = nums2[j++];
        if (count >= 0) System.arraycopy(nums3, 0, nums1, 0, count);
    }
}
