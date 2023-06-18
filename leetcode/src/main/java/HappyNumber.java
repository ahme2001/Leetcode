public class HappyNumber {
    public boolean isHappy(int n) {
        while(n >= 1){
            int sum = 0;
            while(n != 0){
                int x = n % 10;
                n /= 10;
                sum += Math.pow(x,2);
            }
            if(sum == 1)  return true;
            n = sum;
            if((n < 10) && (n > 1) && n != 7) return false;
        }
        return false;
    }
}
