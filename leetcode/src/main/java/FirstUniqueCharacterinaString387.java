import java.util.HashMap;

public class FirstUniqueCharacterinaString387 {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> temp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            temp.put(c,temp.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            int c = temp.get(s.charAt(i));
            if(c==1)
                return i;
        }
        return -1;
    }
}
