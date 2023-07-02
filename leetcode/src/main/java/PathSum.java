public class PathSum {
    int target;
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        target = targetSum;
        sumpath(root,0);
        return flag;
    }

    private void sumpath(TreeNode root,int sum){
        if(root.left == null && root.right == null){
            if((sum+root.val) == target)
                flag = true;
        }else if(root.left != null && root.right == null)
            sumpath(root.left,sum + root.val);
        else if(root.left == null)
            sumpath(root.right,sum + root.val);
        else{
            sumpath(root.left,sum + root.val);
            sumpath(root.right,sum + root.val);
        }
    }
}
