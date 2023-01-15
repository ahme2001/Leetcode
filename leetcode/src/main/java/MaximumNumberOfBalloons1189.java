import java.util.HashMap;
import java.util.Objects;

public class MaximumNumberOfBalloons1189 {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> temp = new HashMap<>();
        temp.put('b',0);
        temp.put('a',0);
        temp.put('l',0);
        temp.put('o',0);
        temp.put('n',0);
        for (int i=0;i<text.length();i++){
            if (text.charAt(i)=='b' || text.charAt(i)=='a' || text.charAt(i)=='l' || text.charAt(i)=='o' || text.charAt(i)=='n')
                temp.put(text.charAt(i),temp.get(text.charAt(i))+1);
        }
        int min = Integer.MAX_VALUE;
        min = Math.min(min,temp.get('a'));
        min = Math.min(min,temp.get('b'));
        min = Math.min(min,temp.get('n'));
        min = Math.min(min,temp.get('o')/2);
        min = Math.min(min,temp.get('l')/2);

        if ((temp.get('b') >= min) && (temp.get('a') >= min) && (temp.get('n') >= min)
                && (temp.get('o') >= 2*min) && (temp.get('l') >= 2*min)) {
            return min;
        }
        return 0;
    }

}
