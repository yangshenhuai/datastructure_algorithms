package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/n-queens/submissions/
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
 *
 * Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.
 *
 * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.
 *
 */
public class NQueens2 {

    private List<List<String>> results = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {

        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++){
            sb.append(".");
        }
        for (int i=0;i<n;i++){
            result.add(sb.toString());
        }
        solve(0,n,result);
        return results;
    }

    private void solve(int row,int n,List<String> result){

        if (row == n){
            //goal :already placed the in row-1 row(starts with 0)
            results.add(new ArrayList<>(result));//need copy an arraylist here since it will be changed during the solve
            return;
        }
        String original = result.get(result.size() -1 );
        for (int col=0;col<n;col++){ //check each col here.
            if (validate(row,col,result)){
                //choice if valid place, then place the Queen here
                StringBuilder sb = new StringBuilder(result.get(row));
                sb.setCharAt(col,'Q');
                result.set(row, sb.toString());

                solve(row+1,n,result); //explore the next row

                //undo the choice so continue explore next place

                result.set(result.size() -1 ,original);
            }

        }





    }

    private boolean validate(int row, int col, List<String> result) {

        for (int i=0;i<result.size();i++){
            if (result.get(i).contains("Q")){
                int row1=i;
                int col1 = result.get(i).indexOf('Q');
                if (col == col1 || Math.abs(row1-row) == Math.abs(col1-col)){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new NQueens2().solveNQueens(4));
    }

}
