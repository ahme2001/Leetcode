import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome409 {
    public int longestPalindrome(String s) {
        if((s.length() == 1) || (s.length() == 2))
            return s.length();
        HashMap<Character,Integer> temp = new HashMap<>();
        for (int i=0;i<s.length();i++){
            temp.put(s.charAt(i),temp.getOrDefault(i,0)+1);
        }
        int res = 0,odd = 0;
        for (Map.Entry<Character,Integer> set : temp.entrySet()) {
            int tt = set.getValue();
            if(tt == 1)
                odd = 1;
            else
                res += (tt-(tt%2));
        }
        return res+odd;
    }
}
