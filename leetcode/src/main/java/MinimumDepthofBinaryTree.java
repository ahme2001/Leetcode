public class MinimumDepthofBinaryTree {
    int minimum = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        depth(root,1);
        return minimum;
    }
    private void depth(TreeNode root,int dep){
        if(root.left == null && root.right == null){
            minimum = Math.min(dep,minimum);
            return;
        }
        if(root.left != null)
            depth(root.left,dep+1);
        if(root.right != null)
            depth(root.right,dep+1);
    }
}
