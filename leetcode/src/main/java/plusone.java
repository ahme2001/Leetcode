import java.util.Stack;

class plusone {
        public int[] plusOne(int[] digits) {
            if(digits.length == 1  && digits[0] == 9)
                return new int[]{1,0};
            int[] res;
            int temp = 0;
            Stack<Integer> t = new Stack<>();
            if(digits[digits.length - 1] == 9){
                t.push(0);
                temp = 1;
            }else{
                t.push(digits[digits.length - 1] + 1);
            }
            for(int i=digits.length-2;i>=0;i--){
                if((digits[i]+temp) == 10){
                    t.push(0);
                    temp = 1;
                }else{
                    t.push(digits[i]+temp);
                    temp = 0;
                }
            }
            if(temp == 1)  t.push(1);
            System.out.println(t.size());
            res = new int[t.size()];
            for(int i=0;i<res.length;i++){
                res[i] = t.pop();
            }
            return res;
        }
}
// @lc code=end

