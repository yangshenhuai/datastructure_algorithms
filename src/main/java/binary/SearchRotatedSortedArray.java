package binary;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 *
 *33. Search in Rotated Sorted Array
 *
 *
 * There is an integer array nums sorted in ascending order (with distinct values).
 *
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 *
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,5,6,7,8,9,1,2,3], target = 0
 *
 *       nums = [4,5,6,7,8,0,1,2,3], target = 0
 * Output: 4
 *
 *  4,5,6,7,0,1,2
 *
 * // if mid > low and target < mid then cut the left part
 * // if mid > low and target > mid then cut the left part
 * // if mid < low and target < mid then cut the right part
 * // if mid < low and target > mid then cut the right part
 *
 * ==>
 *
 * if mid > low then cut the left part
 * if mid < low then cut the right part
 *
 *
 */
public class SearchRotatedSortedArray {


    public int search(int[] nums, int target) {
        int low=0,high=nums.length - 1 ;
        while (low <= high){
            int mid = low + ((high - low) >> 1);
            if (nums[mid] == target){
                return mid;
            }
            if (nums[low] == target){
                return low;
            }
            if (nums[high] == target){
                return high;
            }
            if (nums[high] >= nums[mid] && nums[mid] >= nums[low]){
                if (nums[mid] > target){
                    high = mid - 1;
                }
                else if (nums[mid] < target){
                    low = mid + 1;
                }
                else {
                    return target;
                }
            }
            else {
                if (target < nums[mid] && target < nums[low] && nums[mid] > nums[low]){
                    low = mid + 1;
                }
                else if (target < nums[mid] && target > nums[low]){
                    high = mid - 1;
                }
                else if (target > nums[mid] && nums[mid] > nums[low]){
                    low = mid + 1;
                }
                else if (target > nums[mid] && nums[high] > target){
                    low = mid + 1;
                }
                else {
                    high = mid -1;
                }

            }

        }
        return -1;
    }
}
