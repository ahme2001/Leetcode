public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        int min = Integer.MAX_VALUE;
        for (String str : strs) {
            min = Math.min(str.length(), min);
        }
        boolean flag;
        for (int i=0;i<min;i++){
            char ch = strs[0].charAt(i);
            flag = true;
            for(int j=1;j< strs.length;j++){
                if (ch != strs[j].charAt(i)){
                    flag = false;
                    break;
                }
            }
            if (flag)
                res += ch;
            else
                break;
        }
        return res;
    }

}
