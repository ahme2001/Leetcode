public class FindCenterofStarGraph {
    public int findCenter(int[][] edges) {
        return (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1])?edges[0][0]:edges[0][1];
    }
}
