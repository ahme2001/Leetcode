public class RemoveElement27 {

    public int removeElement(int[] nums, int val) {
        int counter = 0,temp=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] == val){
                counter++;
            }else{
                nums[temp] = nums[i];
                temp++;
            }
        }
        return nums.length-counter;
    }

}
