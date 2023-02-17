import java.util.ArrayList;
import java.util.List;

class node {
    public int val;
    public List<node> children;

    public node() {}

    public node(int _val) {
        val = _val;
    }

    public node(int _val, List<node> _children) {
        val = _val;
        children = _children;
    }
}

public class NaryTreePreorderTraversal589 {
    public List<Integer> preorder(node root) {
        List<Integer> res = new ArrayList<>();
        in(root,res);
        return res;
    }
    private List<Integer> in(node root,List<Integer> res){
        if(root == null) return null;
        res.add(root.val);
        for(int i=0;i<root.children.size();i++){
            in(root.children.get(i),res);
        }
        return res;
    }
}
