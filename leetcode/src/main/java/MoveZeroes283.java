public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        int i=0,j=0,count=1;
        while ((i< nums.length) && (nums[i] != 0)){
            i++;
            j++;
        }
        j++;
        for (;j< nums.length;j++){
            if (nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }else
                count++;
        }
        while ((i< nums.length) && (count != 0)){
            nums[i] = 0;
            i++;count--;
        }
    }
}
