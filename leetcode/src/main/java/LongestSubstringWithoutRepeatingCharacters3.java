import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder res= new StringBuilder();
        int max = 0;
        HashMap<Character,Integer> temp = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char t = s.charAt(i);
            if (temp.containsKey(t)){
                i = temp.get(t);
                temp = new HashMap<>();
                res = new StringBuilder();
                continue;
            }
            res.append(t);
            temp.put(t,i);
            max = Math.max(max,res.length());
        }
        return max;
    }
}