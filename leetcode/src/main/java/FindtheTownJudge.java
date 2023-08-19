public class FindtheTownJudge {
    public int findJudge(int n, int[][] trust) {
        int []arr = new int[n+1];
        for (int[] ints : trust) {
            arr[ints[1]]++;
            arr[ints[0]]--;
        }
        for(int i=1;i<n+1;i++)
            if(arr[i] == (n-1))
                return i;
        return -1;
    }
}
