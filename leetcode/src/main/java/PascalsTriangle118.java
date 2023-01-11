import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        res.add(temp);
        for (int i=1;i<numRows;i++){
            temp = new ArrayList<>();
            temp.add(1);
            for (int j=2;j<=i;j++){
                temp.add(res.get(i-1).get(j-1) + res.get(i-1).get(j-2));
            }
            temp.add(1);
            res.add(temp);
        }
        return res;
    }

}
