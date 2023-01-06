import java.util.Arrays;

public class ReplaceElements1299 {

    public int[] replaceElements(int[] arr){
        if (arr.length <= 1 )
            return new int[]{-1};
        int max = Math.max(arr[arr.length-1],arr[arr.length-2]);
        arr[arr.length-2] = arr[arr.length-1];
        arr[arr.length-1] = -1;
        int temp;
        for (int i=arr.length-3;i>=0;i--){
            temp = arr[i];
            arr[i] = max;
            max = Math.max(max,temp);
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
