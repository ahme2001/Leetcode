public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int[] sum = new int[nums.length];
        for (int num : nums) {
            sum[num]++;
            if (sum[num] > 1) return num;
        }
        return 0;
    }
}
