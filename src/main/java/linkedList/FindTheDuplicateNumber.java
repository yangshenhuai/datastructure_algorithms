package linkedList;

/**
 * https://leetcode.com/problems/find-the-duplicate-number/
 *
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 *
 * There is only one repeated number in nums, return this repeated number.
 *
 * You must solve the problem without modifying the array nums and uses only constant extra space.
 *
 *
 * nums = [1,3,4,2,2]
 *
 *
 * 0 - 1
 * 1 - 3
 * 2 - 4
 * 3 - 2
 * 4 - 2
 *
 *
 *
 */
public class FindTheDuplicateNumber {


    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

}
