package array;

import java.util.*;

/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 *
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 *
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rowMap = new HashMap<>();
        Map<Integer, Set<Character>> colMap = new HashMap<>();
        Map<Integer, Set<Character>> subBoxMap = new HashMap<>();

        for (int row = 0; row < 9 ; row++){
            for (int col=0;col <9; col++){
                if (board[row][col] != '.'){
                    if (rowMap.get(row) != null && rowMap.get(row).contains(board[row][col])){
                        return false;
                    }
                    if (colMap.get(col) != null && colMap.get(col).contains(board[row][col])){
                        return false;
                    }
                    int subBox = getSubBox(row,col);
                    if (subBoxMap.get(subBox) != null && subBoxMap.get(subBox).contains(board[row][col])){
                        return false;
                    }
                    rowMap.computeIfAbsent(row,k-> new HashSet<>()).add(board[row][col]);
                    colMap.computeIfAbsent(col,k-> new HashSet<>()).add(board[row][col]);
                    subBoxMap.computeIfAbsent(subBox,k-> new HashSet<>()).add(board[row][col]);
                }
            }

        }


        return true;
    }

    private int getSubBox(int row,int col) {

        if (row <= 2){
            if (col<=2) return 1;
            else if (col > 2 && col<=5) return 2;
            else return 3;
        }

        else if (row > 2 && row <= 5){
            if (col<=2) return 4;
            else if (col > 2 && col<=5) return 5;
            else return 6;
        }
        else {
            if (col<=2) return 7;
            else if (col > 2 && col<=5) return 8;
            else return 9;
        }

    }

}
