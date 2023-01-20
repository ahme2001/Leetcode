public class ValidPalindrome125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll(" ","");
        StringBuilder res = new StringBuilder();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(((c >= 97) && (c <= 122)) || ((c >= 48) && (c <= 57)))
                res.append(c);
        }
        for (int i=0,j=res.length();i<j;i++,j--){
            if(res.charAt(i) != res.charAt(j))
                return false;
        }
        return true;
    }
}
