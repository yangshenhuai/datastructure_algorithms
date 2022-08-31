package array;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-consecutive-sequence/
 *
 *
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 *
 */
public class LongestConsecutiveSeq {



    public int longestConsecutive(int[] nums) {

        int longest = 1;
        Set<Integer> integerSet = new HashSet<>();
        for (int i : nums){
            integerSet.add(i);
        }

        for (int i : nums){
            if (integerSet.contains(i -1 )){
                continue;
            }

            int temp = i + 1;
            while (integerSet.contains(temp)){
                temp++;
            }
            longest = Math.max(temp - i,longest);
        }

        return longest;

    }


    public static void main(String[] args) {
        System.out.println(new LongestConsecutiveSeq().longestConsecutive(new int[]{100,4,200,1,3,2}));
    }





}
