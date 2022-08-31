package stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * https://leetcode.com/problems/daily-temperatures/
 *
 *
 * 739. Daily Temperatures
 * Medium
 *
 * 7893
 *
 * 172
 *
 * Add to List
 *
 * Share
 * Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
 *
 *
 *
 * Example 1:
 *
 * Input: temperatures = [73,74,75,71,69,72,76,73]
 * Output: [1,1,4,2,1,1,0,0]
 */

public class DailyTemperatures {


    public int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i=0;i<temperatures.length;i++){
            if (stack.isEmpty() || temperatures[stack.peek()] >= temperatures[i]){
                stack.push(i);
            } else {
                while(true){
                    if (stack.isEmpty() || temperatures[stack.peek()] >= temperatures[i]){
                        stack.push(i );
                        break;
                    }
                    int index = stack.pop();
                    result[index] = i - index;
                }
            }


        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new DailyTemperatures().dailyTemperatures(new int[]{73,74,75,71,69,72,76,73})));
        System.out.println(Arrays.toString(new DailyTemperatures().dailyTemperatures(new int[]{30,40,50,60})));
        System.out.println(Arrays.toString(new DailyTemperatures().dailyTemperatures(new int[]{30,60,90})));
        System.out.println(Arrays.toString(new DailyTemperatures().dailyTemperatures(new int[]{90,60,30})));
    }
}
