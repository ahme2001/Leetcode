import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inOrder(root,res);
        return res;
    }

    private void inOrder(TreeNode root, List<Integer> res){
        if(root == null)
            return ;
        inOrder(root.left,res);
        res.add(root.val);
        inOrder(root.right,res);

    }
}
