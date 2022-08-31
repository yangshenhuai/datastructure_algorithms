package stack;

import java.util.*;

/**
 * https://leetcode.com/problems/generate-parentheses/
 *
 * 22. Generate Parentheses
 * Medium
 *
 * 14642
 *
 * 552
 *
 * Add to List
 *
 * Share
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 *
 *
 */
public class GenerateParentheses {


    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        backtrack(result,"",n ,0,0);

        return result;
    }

    private void backtrack(List<String> result ,String currentStr,int max,int openCount,int closeCount) {
        if (currentStr.length() == max * 2){
            result.add(currentStr);
        }
        if (openCount < max){
            backtrack(result,currentStr + "(" ,max,openCount+1,closeCount);
        }
        if (closeCount < openCount){
            backtrack(result,currentStr+")",max,openCount,closeCount+1);
        }
    }


    public static void main(String[] args) {
        System.out.println(new GenerateParentheses().generateParenthesis(2));
    }

}
