package binary;

/**
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 *
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
 *
 * [4,5,6,7,0,1,2] if it was rotated 4 times.
 * [0,1,2,4,5,6,7] if it was rotated 7 times.
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 *
 * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 *
 * You must write an algorithm that runs in O(log n) time.
 *
 * Input: nums = [3,4,5,1,2]
 * Output: 1
 *
 *
 *
 */
public class FindMinRotatedSortedArray {


    public int findMin(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int low=0,high=nums.length-1;
        int min = Integer.MAX_VALUE;
        while (low <= high){

            int mid = low + ((high -low) >> 1);
            min = Math.min(nums[mid],min);
            if (nums[mid] >= nums[low] && nums[mid] >= nums[high]){
                low = mid + 1;
            }
            else if (nums[mid] >= nums[low] && nums[mid] <= nums[high]){
                min = Math.min(nums[low],min);
                break;
            }
            else if (nums[mid] <= nums[low] && nums[mid] <= nums[high]){
                high = mid -1;
            }
            else if (nums[mid] <= nums[low] && nums[mid] >= nums[high]){
                low = mid + 1;
            }

        }
        return min;

    }

}
