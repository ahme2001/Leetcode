class Node{
    int left;
    int right;
    int sum;
}

// Solve of Max Subarray using divide and conquer approach
public class MaxSubarraySum {

    public Node maxSum(int[] arr,int left,int right){
        Node node = new Node();
        if(left == right){
            node.left = left;
            node.right = right;
            node.sum = arr[left];
            return node;
        }
        int mid = (left+right)/2;
        Node nodeLeft = maxSum(arr,left,mid);
        Node nodeRight = maxSum(arr,mid+1,right);
        Node nodeCross = MaxSumCross(arr,left,right,mid);
        if ((nodeLeft.sum >= nodeRight.sum)&&(nodeLeft.sum >= nodeCross.sum))
            return nodeLeft;
        else if ((nodeLeft.sum <= nodeRight.sum)&&(nodeRight.sum >= nodeCross.sum))
            return nodeRight;
        else
            return nodeCross;
    }

    private Node MaxSumCross(int[] arr,int left,int right,int mid){
        Node node = new Node();
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i=mid;i>=left;i--){
            sum += arr[i];
            if(sum >= leftSum){
                leftSum = sum;
                node.left = i;
            }
        }
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i=mid+1;i<=right;i++){
            sum += arr[i];
            if(sum >= rightSum){
                rightSum = sum;
                node.right = i;
            }
        }
        node.sum = leftSum + rightSum;
        return node;
    }

    public static void main(String[] args) {
        MaxSubarraySum t = new MaxSubarraySum();
        Node node = t.maxSum(new int[]{-1,-2},0,1);
        System.out.println(node.left);
        System.out.println(node.right);
        System.out.println(node.sum);
    }
}
