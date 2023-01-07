import java.util.Arrays;

public class LengthOfLastWord58 {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        return str[str.length-1].length();
    }

    public static void main(String[] args) {

    }
}
