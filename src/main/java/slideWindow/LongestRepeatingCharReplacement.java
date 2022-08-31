package slideWindow;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/longest-repeating-character-replacement/
 *
 *
 * 424. Longest Repeating Character Replacement
 * Medium
 *
 * 5680
 *
 * 223
 *
 * Add to List
 *
 * Share
 * You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
 *
 * Return the length of the longest substring containing the same letter you can get after performing the above operations.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ABAB", k = 2
 * Output: 4
 * Explanation: Replace the two 'A's with two 'B's or vice versa.
 *
 *  k =1
 *  AABABBA
 *
 *
 *
 */
public class LongestRepeatingCharReplacement {

    public int characterReplacement(String s, int k) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = 0;
        int maxLen = 0;
        int[] countArr = new int[26];

        while (end < arr.length){
            countArr[arr[end] - 'A']++;
            int maxCharCount = 0;
            for (int count : countArr){
                maxCharCount = Math.max(maxCharCount,count);
            }

            if (end - start + 1 - maxCharCount <= k){
                maxLen = Math.max(maxLen,end -start +1);
                end++;
            } else {
                countArr[arr[start] - 'A']--;
                countArr[arr[end] - 'A']--;
                start++;
            }

        }
        return maxLen;

    }

    public static void main(String[] args) {
        System.out.println(new LongestRepeatingCharReplacement().characterReplacement("AABABBA",1));
        System.out.println(new LongestRepeatingCharReplacement().characterReplacement("ABAB",2));
        System.out.println(new LongestRepeatingCharReplacement().characterReplacement("AAAB",0));
        System.out.println(new LongestRepeatingCharReplacement().characterReplacement("ABAA",0));
        System.out.println(new LongestRepeatingCharReplacement().characterReplacement("ABBB",2));
    }
}
