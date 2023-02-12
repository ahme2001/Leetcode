import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> temp = new HashSet<>();
        for (int num : nums) {
            if (temp.contains(num))
                return true;
            temp.add(num);
        }
        return false;
    }
}
