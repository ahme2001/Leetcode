import java.util.*;

class generateparentheses {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate("",n,n);
        return res;
    }
    private void generate(String sb,int open,int close){
        if(open > close)    return;
        if(open > 0 && close > 0){
            generate(sb + "(",open - 1,close);
        }
        if(close > 0){
            generate(sb + ")",open,close-1);
        }
        if(open==0 & close == 0)
            res.add(sb);
    }
    
}