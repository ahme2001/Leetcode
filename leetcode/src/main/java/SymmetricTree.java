public class SymmetricTree {
    boolean flag;

    public boolean isSymmetric(TreeNode root) {
        if(root == null || ((root.left == null) && (root.right == null)))
            return true;
        if(root.left == null || root.right == null)
            return false;
        this.flag = true;
        symmetric(root.left,root.right);
        return this.flag;
    }

    private void symmetric(TreeNode left,TreeNode right){
        if(left == null && right == null)
            return;
        if(left == null || right == null){
            this.flag = false;
            return;
        }
        System.out.println(left.val +" " + right.val);
        if(left.val != right.val)
        {
            this.flag = false;
            return;
        }
        symmetric(left.left,right.right);
        symmetric(left.right,right.left);
    }
}
