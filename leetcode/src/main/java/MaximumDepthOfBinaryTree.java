public class MaximumDepthOfBinaryTree {
    private int depth = 0;
    public int maxDepth(TreeNode root) {
        Depth(root,0);
        return this.depth;
    }
    private void Depth(TreeNode node,int dep){
        if(node == null){
            this.depth = Math.max(this.depth,dep);
            return;
        }
        Depth(node.left,dep+1);
        Depth(node.right,dep+1);
    }
}
