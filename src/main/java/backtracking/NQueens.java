package backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    private List<List<Integer>> allResults = new ArrayList<>();
    public List<List<Integer>> solveNQueens(int n) {
        //index represents row ,and value represnets the col.
        List<Integer> result = new ArrayList<>();
        solve(0,n,result);
        return allResults;
    }

    private void solve(int row, int n, List<Integer> result) {
        if (row == n){
            allResults.add(new ArrayList<>(result));
            return;
        }

        for (int col=0;col<n;col++){
            if (valid(row,col,result)){
                result.add(col);
                solve(row+1,n,result);
                result.remove(result.size() -1);
            }
        }
    }

    private boolean valid(int row, int col, List<Integer> result) {
        if (result.contains(col)){
            return false;
        }
        for (int i=0;i<result.size();i++){
            if (i - result.get(i) == row - col){
                return false;
            }
            if (i + result.get(i) == row + col) {
                 return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(new NQueens().solveNQueens(4));
        System.out.println(new NQueens().solveNQueens(8));
    }


}
