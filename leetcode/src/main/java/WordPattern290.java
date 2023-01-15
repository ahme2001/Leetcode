import java.util.HashMap;
import java.util.Objects;

public class WordPattern290 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> temp = new HashMap<>();
        String[] str = s.split(" ");
        if(pattern.length() != str.length)
            return false;
        for (int i=0;i<pattern.length();i++){
            if(temp.containsKey(pattern.charAt(i))){
                if(!Objects.equals(temp.get(pattern.charAt(i)), str[i]))
                    return false;
            }else if(temp.containsValue(str[i]))
                return false;
            else
                temp.put(pattern.charAt(i),str[i]);

        }
        return true;
    }

    public static void main(String[] args) {
        WordPattern290 t = new WordPattern290();
        System.out.println(t.wordPattern("abba","dog dog dog dog"));
    }
}
