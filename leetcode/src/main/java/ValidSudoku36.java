import java.util.HashSet;
import java.util.Set;

public class ValidSudoku36 {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> temp;
        for (int i=0;i<9;i++){
            temp = new HashSet<>();
            for (int j=0;j<9;j++){
                if(board[i][j] == '.')
                    continue;
                if(temp.contains(board[i][j]))
                    return false;
                temp.add(board[i][j]);
            }
        }
        for (int i=0;i<9;i++){
            temp = new HashSet<>();
            for (int j=0;j<9;j++){
                if(board[j][i] == '.')
                    continue;
                if(temp.contains(board[j][i]))
                    return false;
                temp.add(board[j][i]);
            }
        }
        int j = 0;
        for (int i=0;i<3;i++){
            int count;
            temp = new HashSet<>();
            for (int q=0;q<3;q++) {
                count = 0;
                while (count<3) {
                    count++;
                    if(board[q][j+count-1] == '.')
                        continue;
                    if (temp.contains(board[q][j+count-1]))
                        return false;
                    temp.add(board[q][j+count-1]);
                }
            }
            j += 3;
        }
        j = 0;
        for (int i=0;i<3;i++){
            int count;
            temp = new HashSet<>();
            for (int q=3;q<6;q++) {
                count = 0;
                while (count<3) {
                    count++;
                    if(board[q][j+count-1] == '.')
                        continue;
                    if (temp.contains(board[q][j+count-1]))
                        return false;
                    temp.add(board[q][j+count-1]);
                }
            }
            j += 3;
        }
        j = 0;
        for (int i=0;i<3;i++){
            int count;
            temp = new HashSet<>();
            for (int q=6;q<9;q++) {
                count = 0;
                while (count<3) {
                    count++;
                    if(board[q][j+count-1] == '.')
                        continue;
                    if (temp.contains(board[q][j+count-1]))
                        return false;
                    temp.add(board[q][j+count-1]);
                }
            }
            j += 3;
        }
        return true;
    }
}
