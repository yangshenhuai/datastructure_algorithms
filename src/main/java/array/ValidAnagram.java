package array;


/**
 * leetcode : https://leetcode.com/problems/valid-anagram/
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {


        int[] charCountArr = new int[26];


        if(s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] rArr = t.toCharArray();

        for(char sc : sArr){
            charCountArr[sc - 'a'] = charCountArr[sc - 'a'] + 1; //for each character in first string, add 1 in the coresponding char index.
        }

        for(char rc : rArr){
            charCountArr[rc - 'a'] = charCountArr[rc - 'a'] - 1; //for each character in first string, minus 1 in the coresponding char index.
        }



        for(int i : charCountArr){
            if(i != 0){
                return false;
            }
        }
        return true;
    }

}
