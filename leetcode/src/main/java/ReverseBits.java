public class ReverseBits {
    public int reverseBits(int n) {
        int t,res=0;
        for(int i=0;i<32;i++){
            t = n & 1;
            n = n >> 1;
            res = res | (t << (31-i));
        }
        return res;
    }
}
