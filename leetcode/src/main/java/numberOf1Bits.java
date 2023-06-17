public class numberOf1Bits {
    public int hammingWeight(int n) {
        int t , num=0;
        for(int i=0;i<32;i++){
            t = n & 1;
            n = n >> 1;
            if(t == 1)
                num++;
        }
        return num;
    }
}
