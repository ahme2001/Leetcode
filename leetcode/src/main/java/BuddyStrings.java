public class BuddyStrings {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        int count = 0;
        int[] letter = new int[26];
        Character[] x = new Character[2];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != goal.charAt(i)){
                count++;
                if(count == 1){
                    x[0] = s.charAt(i);
                    x[1] = goal.charAt(i);
                }else if(count == 2){
                    if(x[0] != goal.charAt(i) || x[1] != s.charAt(i))
                        return false;
                }else
                    return false;
            }
            letter[s.charAt(i)%97]++;
        }
        for(int i=0;i<26;i++){
            if(letter[i] > 1 && count == 0)
                return true;
        }
        return count == 2;
    }
}
