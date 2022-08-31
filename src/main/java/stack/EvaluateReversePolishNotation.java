package stack;

import java.util.Stack;

/**
 * https://leetcode.com/problems/evaluate-reverse-polish-notation/
 *
 *
 * 150. Evaluate Reverse Polish Notation
 * Medium
 *
 * 3758
 *
 * 681
 *
 * Add to List
 *
 * Share
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 *
 * Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
 *
 * Note that division between two integers should truncate toward zero.
 *
 * It is guaranteed that the given RPN expression is always valid. That means the expression would always evaluate to a result, and there will not be any division by zero operation.
 *
 *
 */
public class EvaluateReversePolishNotation {


    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens){
            if (token.matches("-?\\d+")){
                stack.push(Integer.valueOf(token));
            } else {
                int num1 = stack.pop();
                int num2 = stack.pop();
                if (token.equals("+")){
                    stack.push(num2 + num1);
                }
                if (token.equals("-")){
                    stack.push(num2 - num1);
                }
                if (token.equals("*")){
                    stack.push(num2* num1);
                }
                if (token.equals("/")){
                    stack.push(num2/num1);
                }
            }
        }

        return stack.pop();

    }

    public static void main(String[] args) {
        System.out.println(new EvaluateReversePolishNotation().evalRPN(new String[]{"2","1","+","3","*"}));
        System.out.println(new EvaluateReversePolishNotation().evalRPN(new String[]{"4","13","5","/","+"}));
        System.out.println(new EvaluateReversePolishNotation().evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}
