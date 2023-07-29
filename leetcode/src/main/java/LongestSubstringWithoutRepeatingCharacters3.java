import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0,left = 0 , right = 0;
        HashSet<Character> temp = new HashSet<>();
        while(right < s.length()){
            char t = s.charAt(right);
            if (temp.contains(t)){
                temp.remove(s.charAt(left));
                left++;
            }else{
                temp.add(t);
                max = Math.max(max,right-left+1);
                right++;
            }
        }
        return max;
    }
}