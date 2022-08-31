package binary;

/**
 * https://leetcode.com/problems/search-a-2d-matrix/
 *
 * Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
 *
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 *
 */
public class Search2DMatrix {



    public boolean searchMatrix(int[][] matrix, int target) {

        int outLow = 0, outHigh = matrix.length - 1;

        while (outLow <= outHigh){
            int outMid = (outHigh + outLow) / 2;

            int inLow = 0, inHigh = matrix[outMid].length -1 ;

            if (matrix[outMid][inLow] > target){
                outHigh = outMid - 1 ;
                continue;
            }
            if (matrix[outMid][inHigh] < target){
                outLow = outMid + 1;
                continue;
            }
            while (inLow <= inHigh){
              int inMid = (inLow + inHigh) / 2;
              if (matrix[outMid][inMid] > target){
                  inHigh = inMid -1;
              }
              else if (matrix[outMid][inMid] < target){
                  inLow = inMid + 1;
              }
              else {
                  return true;
              }
            }
            return false;
        }

        return false;
    }


    public static void main(String[] args) {
        System.out.println(new Search2DMatrix().searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}},13));
    }


}
