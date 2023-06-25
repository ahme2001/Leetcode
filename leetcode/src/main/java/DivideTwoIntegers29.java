class DivideTwoIntegers29 {
    public int divide(int dividend, int divisor) {

        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        boolean flag = (divisor < 0 && dividend < 0) || (divisor > 0 && dividend > 0);
        long test = Math.abs((long) dividend);
        long testdivisor = Math.abs((long) divisor);
        long count = 0;
        if(testdivisor > test)  return 0;
        while(test >= testdivisor){
            int shift = 0;
            while(test >= (testdivisor << shift))
                shift++;
            shift--;
            test -= (testdivisor << shift);
            count += (1L << shift);
        }
        if(!flag)
            return (int) (-1 * count);
        else
            return (int) count;
    }
}