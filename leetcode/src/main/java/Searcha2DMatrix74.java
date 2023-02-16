public class Searcha2DMatrix74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0,right = matrix.length,mid=(left+right)/2;
        int temp = -100000;
        while(left < right){
            mid = (left+right)/2;
            temp = matrix[mid][0];
            if(temp > target)
                right = mid;
            else if(temp < target)
                left = mid+1;
            else
                return true;
        }
        if(temp > target)
            mid--;
        if(mid < 0) return false;
        left = 0;right = matrix[0].length;
        int mid2;
        while(left < right){
            mid2 = (left+right)/2;
            temp = matrix[mid][mid2];
            System.out.print(temp + " ");
            if(temp > target)
                right = mid2;
            else if(temp < target)
                left = mid2+1;
            else
                return true;

        }
        return false;
    }
}
