public class ValidPalindromeII680 {
    public boolean validPalindrome(String s) {
        for(int i=0,j=s.length()-1;i<j;i++,j--) {
            if (!(s.charAt(i) == s.charAt(j))) {
                if (validPalindromeII(s, i + 1, j) || validPalindromeII(s, i, j - 1))
                    break;
                else
                    return false;
            }
        }
        return true;
    }

    public boolean validPalindromeII(String s,int st,int end) {
        for(int i=st,j=end;i<j;i++,j--){
            if (!(s.charAt(i) == s.charAt(j)))
                return false;
        }
        return true;
    }
}
