import java.util.*;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (Integer i : row) {
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = 0;
            }
        }
        for (Integer i : col) {
            for(int j=0;j<matrix.length;j++){
                matrix[j][i] = 0;
            }
        }
    }
}
