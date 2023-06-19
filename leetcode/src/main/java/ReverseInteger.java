public class ReverseInteger {
    public int reverse(int x) {
        if(x >= 2147483647 || x <= -2147483647) return 0;
        int flag = (x > 0)? 0:1;
        x = Math.abs(x);
        int res = 0,i=String.valueOf(x).length()-1;
        while(x != 0){
            res += ((x%10) * Math.pow(10,i--));
            x /= 10;
            if(res >= 2147483647)    return 0;
        }
        if(flag != 0)
            return res * -1;
        return res;
    }
}
