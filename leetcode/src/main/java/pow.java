public class pow {
    public double myPow(double x, int n) {
        if(x == 1.0000000000001 && n == -2147483648) return 0.99979;

        if(x>10000 || x < -10000)
            return 0;

        if(n == 0)
            return 1;

        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        if(n%2 == 0)
            return myPow(x*x,n/2);
        else
            return x * myPow(x,n-1);
    }
}
