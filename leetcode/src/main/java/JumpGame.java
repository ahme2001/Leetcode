import java.util.*;

public class JumpGame {
    boolean[] visited;
    public boolean canJump(int[] nums) {
        visited = new boolean[nums.length];
        Arrays.fill(visited,false);
        return jump(nums,0);
    }
    private boolean jump(int[] nums,int index){
        if(index == nums.length-1 || nums[index] >= (nums.length-1 - index))  return true;
        if(nums[index] == 0) return false;

        for(int i=1;i<=nums[index];i++){
            if(!visited[index+i]){
                visited[index+i] = true;
                if(jump(nums,index+i)){
                    return true;
                }
            }
        }
        return false;
    }
}
