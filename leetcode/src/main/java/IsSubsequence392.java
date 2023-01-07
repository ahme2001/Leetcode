public class IsSubsequence392 {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        if (t.length() < s.length())
            return false;
        int j=0,counter=0;
        for (int i=0;i<t.length();i++){
            if(s.charAt(j) == t.charAt(i)) {
                j++;
                counter++;
            }
            if (j>=s.length())
                break;
        }
        return counter == s.length();
    }

    public static void main(String[] args) {

    }
}
