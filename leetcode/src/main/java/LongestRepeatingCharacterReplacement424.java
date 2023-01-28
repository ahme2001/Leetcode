import java.util.Arrays;
import java.util.HashMap;

public class LongestRepeatingCharacterReplacement424 {
    public int characterReplacement(String s, int k) {
        if(k == s.length()) return s.length();

        int start =0,right=0,maxf=0,res=0;
        int[] freq = new int[26];
        Arrays.fill(freq,0);
        while (right<s.length()) {
            char c = s.charAt(right);
            freq[c%65]++;
            maxf = Math.max(maxf,freq[c%65]);

            while (((right-start + 1)-maxf) > k) {
                freq[s.charAt(start)-65]--;
                start++;
            }

            res = Math.max(res,right-start+1);
            right++;
        }

        return res;
    }
}
/*
if(k == s.length()) return s.length();
        int temp = k,replay = 1,count=1,res = 0;
        char c = s.charAt(0);
        for (int i=1;i<s.length();i++){
            if(s.charAt(i) == c){
                count++;
            }else if((temp == k)&&(temp > 0)){
                replay = i;
                temp--;count++;
            }else if(temp > 0){
                temp--;count++;
            }else if(temp == 0){
                res = Math.max(res,count);
                c = s.charAt(replay);
                temp = k;i=replay;count=1;
            }
        }
        return res;
 */