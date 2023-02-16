public class ReshapetheMatrix566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] temp = new int[r][c];
        int row = mat.length,col = mat[0].length;
        int rowCount = 0,colCount = 0,count = row * col;
        if((r*c) != count) return mat;

        col--;
        for(int i=0;i<r;i++){
            for(int j=0;((j<c) && (count >0));j++){
                temp[i][j] = mat[rowCount][colCount++];
                count--;
                if(colCount > col){
                    colCount = 0;
                    rowCount++;
                }
            }
        }
        return temp;
    }
}
