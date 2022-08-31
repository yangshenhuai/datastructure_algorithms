package stack;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 *
 * 20. Valid Parentheses
 * Easy
 *
 * 14994
 *
 * 732
 *
 * Add to List
 *
 * Share
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 */
public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        char[] arr = s.toCharArray();

        for (char c : arr){

            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }

            if (c == ')' || c == '}' || c ==']'){
                char open = stack.pop();
                if(!matching(open,c)){
                    return false;
                }
            }

        }
        return stack.isEmpty();

    }

    private boolean matching(char open, char c) {
        if (open == '(')
            return c == ')';
        else if (open == '{')
            return c == '}';
        else
            return c == ']';
    }


    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("()"));
        System.out.println(new ValidParentheses().isValid("()[]{}"));
        System.out.println(new ValidParentheses().isValid("(]"));
    }
}
