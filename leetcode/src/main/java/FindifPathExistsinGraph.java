import java.util.*;

public class FindifPathExistsinGraph {
    List<List<Integer>> temp;
    int[] arr;
    boolean flag = false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) return true;
        temp = new ArrayList<>();
        for(int i=0; i<n; i++){
            temp.add(new ArrayList<>());
        }
        arr = new int[n];
        for (int[] edge : edges) {
            temp.get(edge[0]).add(edge[1]);
            temp.get(edge[1]).add(edge[0]);
        }
        checkneighbours(source,destination);
        return flag;
    }

    private void checkneighbours(int source,int des){
        if(arr[source] != 0)
            return;
        arr[source] = 1;
        List<Integer> te = temp.get(source);
        for (Integer integer : te) {
            if (integer == des) {
                flag = true;
                return;
            }
            checkneighbours(integer, des);
        }
    }
}
