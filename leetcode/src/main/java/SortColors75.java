public class SortColors75 {
    public void sortColors(int[] nums) {
        int[] temp = new int[]{0, 0, 0};
        for (int num : nums) {
            temp[num]++;
        }
        for (int j = 0; j < temp[0]; j++) {
            nums[j] = 0;
        }
        int res = temp[1] + temp[0];
        for (int j = temp[0]; j < res; j++) {
            nums[j] = 1;
        }
        res += temp[2];
        for (int j = temp[1] + temp[0]; j < res; j++) {
            nums[j] = 2;
        }
    }
}
