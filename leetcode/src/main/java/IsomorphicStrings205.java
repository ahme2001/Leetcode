import java.util.HashMap;

public class IsomorphicStrings205 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> store = new HashMap<>();
        if(s.length() != t.length())
            return false;
        for (int i=0;i<s.length();i++){
            if (store.containsKey(s.charAt(i))){
                if (store.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }else if(store.containsValue(t.charAt(i)))
                return false;
            else
                store.put(s.charAt(i),t.charAt(i));
        }
        return true;
    }
}
