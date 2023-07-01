public class LongestPalindromeSubstring {
    public String longestPalindrome(String s) {
        String res="",temp;
        int st,en;
        for(int i=0;i<s.length();i++){
            st = i-1;en = i+1;
            while(st>=0 && en<s.length() && (s.charAt(st) == s.charAt(en))){
                st--;en++;
            }
            temp = s.substring(st+1,en);
            if(res.length() < temp.length())
                res = temp;
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                st = i-1;en = i+2;
                while(st>=0 && en<s.length() && (s.charAt(st) == s.charAt(en))){
                    st--;en++;
                }
                temp = s.substring(st+1,en);
                if(res.length() < temp.length())
                    res = temp;
            }
        }
        // System.out.println(res);
        return res;
    }
}
