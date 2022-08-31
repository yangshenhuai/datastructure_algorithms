package array;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/product-of-array-except-self/
 *
 *Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 *
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 *
 */
public class ProductOfArrayExceptItSelf {


    /**
     * for each element in the result array , it's the product of pre result(the product of prefix arr)
     * and post result(the product of post fix arr)
     *
     *     1 ,2 ,3 ,4
     *
     *pre  1  1  2  6
     *pos
     *
     *
     * @param nums
     * @return
     */

    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        int pre = 1;
        for (int i=0 ; i< nums.length; i++){
            if (i == 0){
                result[i] = 1;
            } else {
                result[i] = pre * nums[i -1];
                pre = result[i];
            }

        }
        int post = 1;
        for (int i= nums.length-1;i>=0;i--){
            result[i] = result[i] * post;
            post = post * nums[i];

        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ProductOfArrayExceptItSelf().productExceptSelf(new int[]{1,2,3,4})));
    }

}
