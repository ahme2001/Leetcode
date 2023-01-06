import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int temp[] = new int[26];
        if (s.length() != t.length())
            return false;
        Arrays.fill(temp,0);
        for (int i=0;i<s.length();i++){
            temp[s.charAt(i)%97]++;
            temp[t.charAt(i)%97]--;
        }
        for (int i=0;i<26;i++) {
            if (temp[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram t = new ValidAnagram();
        System.out.println(t.isAnagram("aa","a"));
    }
}
