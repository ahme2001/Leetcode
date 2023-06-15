public class ConvertedSortedArrayToBinarySearchTree108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return connect(0,nums.length-1,nums);
    }
    private TreeNode connect(int start , int finish,int[] nums){
        if(start > finish)
            return null;
        int mid = (start+finish)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.right = connect(mid+1,finish,nums);
        root.left = connect(start,mid-1,nums);
        return root;
    }
}
