public class ProductOfArrayExceptSelf238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftMul = new int[n];
        int[] rightMul = new int[n];
        leftMul[0] = 1;
        rightMul[n-1] = 1;
        int temp = nums[0];
        for (int i=1;i<n;i++){
            leftMul[i] = temp;
            temp *= nums[i];
        }
        temp = nums[n-1];
        for (int i=n-2;i>=0;i--){
            rightMul[i] = temp;
            temp *= nums[i];
        }

        for (int i=0;i<n;i++){
            leftMul[i] = leftMul[i]*rightMul[i];
        }
        return leftMul;
    }
}
