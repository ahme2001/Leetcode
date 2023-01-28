import java.util.Stack;

public class ValidParentheses20 {
    public boolean isValid(String s) {
        if (s.length() <= 1) return false;
        Stack<Character> temp = new Stack<>();
        for (int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c=='(' || c=='{' || c=='[')
                temp.push(c);
            else{
                if (temp.size() < 1) return false;
                char t = temp.pop();
                if(c == ')' && t != '(')
                    return false;
                if(c == ']' && t != '[')
                    return false;
                if(c == '}' && t != '{')
                    return false;
            }
        }
        return temp.size() <= 0;
    }
}
