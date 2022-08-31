package slideWindow;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 *
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 */
public class LongestSubStringWithoutRepeating {

    public int lengthOfLongestSubstring(String s) {

        int maxLen = 0;
        if (s.isEmpty()){
            return 0;
        }

        char[] charArr = s.toCharArray();

        int i=0,j=1;

        Set<Character> subStrSet = new HashSet<>();
        subStrSet.add(charArr[i]);
        while (j < charArr.length ){
            if (subStrSet.add(charArr[j])){
                j++;
                maxLen = Math.max(maxLen,j-i);
            } else {
                i = i+1;
                j = i+1;
                subStrSet.clear();
                subStrSet.add(charArr[i]);
            }

        }

        return Math.max(maxLen,subStrSet.size());

    }

    public static void main(String[] args) {
        System.out.println(new LongestSubStringWithoutRepeating().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new LongestSubStringWithoutRepeating().lengthOfLongestSubstring("pwwkew"));
        System.out.println(new LongestSubStringWithoutRepeating().lengthOfLongestSubstring("bbbbb"));
        System.out.println(new LongestSubStringWithoutRepeating().lengthOfLongestSubstring("dvdf"));
        System.out.println(new LongestSubStringWithoutRepeating().lengthOfLongestSubstring("anviaj"));
    }
}
