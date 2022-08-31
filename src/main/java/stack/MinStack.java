package stack;

import java.util.Stack;

/**
 *
 *
 * https://leetcode.com/problems/min-stack/
 * 155. Min Stack
 * Medium
 *
 * 9203
 *
 * 663
 *
 * Add to List
 *
 * Share
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * Implement the MinStack class:
 *
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * You must implement a solution with O(1) time complexity for each function.
 */
public class MinStack {


    Stack<Integer> s1 = new Stack<>();

    Stack<Integer> s2 = new Stack<>();


    public MinStack() {

    }

    public void push(int val) {

        s1.push(val);
        if (s2.isEmpty() || val <= s2.peek()){
            s2.push(val);
        }

    }

    public void pop() {
        int val = s1.pop();
        if ( val <= s2.peek()){
            s2.pop();
        }

    }

    public int top() {
        return s1.peek();
    }

    public int getMin() {
        return s2.peek();
    }








}
