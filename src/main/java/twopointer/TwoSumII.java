package twopointer;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 *
 *
 * 167. Two Sum II - Input Array Is Sorted
 * Medium
 *
 * 7248
 *
 * 1043
 *
 * Add to List
 *
 * Share
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 *
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 *
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 *
 * Your solution must use only constant extra space.
 *
 *
 *  2, 7 ,11 ,15
 *
 *
 */
public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i=0,j=numbers.length-1;i<j;){
            if (numbers[i] + numbers[j] > target){
                j--;
            }
            else if (numbers[i] + numbers[j] < target){
                i++;
            }
            else {
                result[0] = i+1;
                result[1] = j+1;
                break;
            }

        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSumII().twoSum(new int[]{2,7,11,15},9)));
    }




}
