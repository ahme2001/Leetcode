import java.util.Arrays;

public class MinimumCostToCutAStick1547 {

    public int minCost(int n, int[] cuts) {
        int[] c = new int[cuts.length+2];
        c[0] = 0;
        System.arraycopy(cuts, 0, c, 1, c.length - 1 - 1);
        c[c.length-1] = n;
        Arrays.sort(c);
        int[][] mm = new int[c.length][c.length];
        for (int i=0;i< c.length;i++){
            for (int j=0;j< c.length;j++)
                mm[i][j] = 0;
        }
        for (int i=0;i< c.length;i++){
            for (int j=i-1;j>=0;j--){
                for (int k=i-1;k>j;k--){
                    if (mm[j][i] == 0)
                        mm[j][i] = mm[j][k]+mm[k][i]+c[i]-c[j];
                    else
                        mm[j][i] = Math.min(mm[j][i],mm[j][k]+mm[k][i]+c[i]-c[j]);
                }
            }
        }
        return mm[0][c.length-1];
    }

    public static void main(String[] args) {
        MinimumCostToCutAStick1547 t = new MinimumCostToCutAStick1547();
        System.out.println(t.minCost(7,new int[]{1,3,4,5}));
    }
}
