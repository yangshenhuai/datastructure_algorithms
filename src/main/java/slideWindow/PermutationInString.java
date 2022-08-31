package slideWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * https://leetcode.com/problems/permutation-in-string/
 *
 *
 * 567. Permutation in String
 * Medium
 *
 * 6848
 *
 * 218
 *
 * Add to List
 *
 * Share
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 *
 * In other words, return true if one of s1's permutations is the substring of s2.
 *
 *
 *
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 */
public class PermutationInString {





    public boolean checkInclusion(String s1, String s2) {
            Map<Character,Integer> charArrCount = new HashMap<>();

            char[] arr = s1.toCharArray();
            for (char c : arr) {
                charArrCount.put(c,charArrCount.getOrDefault(c,0) + 1);
            }

            int start =0,end =s1.length() -1;

            while (end < s2.length()){
                char[] partialArr = s2.substring(start,end+1).toCharArray();
                if(containsAll(partialArr,new HashMap<>(charArrCount))){
                    return true;
                } else {
                    start++;
                    end++;
                }
            }

            return false;
    }

    private boolean containsAll(char[] partialArr, HashMap<Character, Integer> characterIntegerHashMap) {
        for (char c : partialArr){
            if (!characterIntegerHashMap.containsKey(c) || characterIntegerHashMap.get(c) <=0){
                return false;
            } else {
                characterIntegerHashMap.put(c,characterIntegerHashMap.get(c)-1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new PermutationInString().checkInclusion("ab","eidbaooo"));
        System.out.println(new PermutationInString().checkInclusion("ab","eidboaoo"));
    }

}
