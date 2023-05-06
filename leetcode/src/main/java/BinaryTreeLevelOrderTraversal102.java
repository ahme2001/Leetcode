import java.util.ArrayList;
import java.util.List;
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
public class BinaryTreeLevelOrderTraversal102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return null;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(root.val);
        res.add(temp);
        te(root,res);
        return res;
    }

    private void te(TreeNode root, List<List<Integer>> res){
        if(root == null) return;
        List<Integer> temp = new ArrayList<>();
        temp.add(root.left.val);
        temp.add(root.right.val);
        res.add(temp);
        te(root.left,res);
        te(root.right,res);
    }
}
