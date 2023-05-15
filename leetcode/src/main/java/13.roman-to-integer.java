/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> temp = new HashMap<>();
        temp.put('I',1);
        temp.put('V',5);
        temp.put('X',10);
        temp.put('L',50);
        temp.put('C',100);
        temp.put('D',500);
        temp.put('M',1000);
        int res = 0;
        for (int i=0;i<s.length();i++){
            if(i+1 < s.length() && temp.get(s.charAt(i)) < temp.get(s.charAt(i+1))){
                res -= temp.get(s.charAt(i));
            }else{
                res += temp.get(s.charAt(i));
            }
        }
        return res;
    }
}
// @lc code=end

