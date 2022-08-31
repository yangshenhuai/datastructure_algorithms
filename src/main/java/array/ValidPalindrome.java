package array;

/**
 * https://leetcode.com/problems/valid-palindrome/
 *
 *125. Valid Palindrome
 *
 * Add to List
 *
 * Share
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 *
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        char[] arr = s.toLowerCase().toCharArray();
        for (int i=0,j=arr.length-1;i<=j;i++,j--){

            while ( i < arr.length-1 && !(arr[i]>= 'a' && arr[i]<='z' || arr[i] >='0'&& arr[i] <='9') ){
                i++;
            }
            while (j > 0 && !(arr[j]>= 'a' && arr[j]<='z' || arr[j] >='0'&& arr[j] <='9') ){
                j--;
            }
            if (i > j){ //there's no valid letter-number
                return true;
            }

            if (arr[i] != arr[j]){
                   return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(new ValidPalindrome().isPalindrome(".,"));
    }

}
