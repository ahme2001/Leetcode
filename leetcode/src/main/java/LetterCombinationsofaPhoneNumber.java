import java.util.*;

public class LetterCombinationsofaPhoneNumber {
    List<List<String>> t = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        List<String> temp0 = new ArrayList<>(Arrays.asList(".",""));
        List<String> temp1 = new ArrayList<>(Arrays.asList(".",""));
        List<String> temp2 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> temp3 = new ArrayList<>(Arrays.asList("d", "e", "f"));
        List<String> temp4 = new ArrayList<>(Arrays.asList("g", "h", "i"));
        List<String> temp5 = new ArrayList<>(Arrays.asList("j", "k", "l"));
        List<String> temp6 = new ArrayList<>(Arrays.asList("m", "n", "o"));
        List<String> temp7 = new ArrayList<>(Arrays.asList("p", "q", "r", "s"));
        List<String> temp8 = new ArrayList<>(Arrays.asList("t", "u", "v"));
        List<String> temp9 = new ArrayList<>(Arrays.asList("w", "x", "y", "z"));
        t.add(temp0);t.add(temp1);t.add(temp2);t.add(temp3);
        t.add(temp4);t.add(temp5);t.add(temp6);t.add(temp7);
        t.add(temp8);t.add(temp9);
        return getCombinations(digits);
    }
    private List<String> getCombinations(String remainDigits){
        if(remainDigits.length() == 0)  return new ArrayList<>();
        int x = Integer.parseInt(remainDigits.charAt(0) + "") % 48;
        System.out.println(x);
        List<String> list = getCombinations(remainDigits.substring(1));
        List<String> res = new ArrayList<>();
        int y = t.get(x).size();
        if(list == null || list.size() == 0)    return t.get(x);
        for(int i=0;i<y;i++){
            for (String s : list) {
                res.add(t.get(x).get(i) + s);
            }
        }
        return res;
    }
}
