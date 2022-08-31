package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> minuendMap = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (minuendMap.containsKey(nums[i])){
                return new int[]{i,minuendMap.get(nums[i])};
            }
            minuendMap.put(target - nums[i], i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{2,7,11,15},9)));
    }

}
