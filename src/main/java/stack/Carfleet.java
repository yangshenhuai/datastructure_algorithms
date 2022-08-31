package stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/car-fleet/
 *
 * 853. Car Fleet
 * Medium
 *
 * 1782
 *
 * 464
 *
 * Add to List
 *
 * Share
 * There are n cars going to the same destination along a one-lane road. The destination is target miles away.
 *
 * You are given two integer array position and speed, both of length n, where position[i] is the position of the ith car and speed[i] is the speed of the ith car (in miles per hour).
 *
 * A car can never pass another car ahead of it, but it can catch up to it and drive bumper to bumper at the same speed. The faster car will slow down to match the slower car's speed. The distance between these two cars is ignored (i.e., they are assumed to have the same position).
 *
 * A car fleet is some non-empty set of cars driving at the same position and same speed. Note that a single car is also a car fleet.
 *
 * If a car catches up to a car fleet right at the destination point, it will still be considered as one car fleet.
 *
 * Return the number of car fleets that will arrive at the destination.
 *
 *
 * Example 1:
 *
 * Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
 * Output: 3
 * Explanation:
 * The cars starting at 10 (speed 2) and 8 (speed 4) become a fleet, meeting each other at 12.
 * The car starting at 0 does not catch up to any other car, so it is a fleet by itself.
 * The cars starting at 5 (speed 1) and 3 (speed 3) become a fleet, meeting each other at 6. The fleet moves at speed 1 until it reaches target.
 * Note that no other cars meet these fleets before the destination, so the answer is 3.
 *
 */
public class Carfleet {


    public int carFleet(int target, int[] position, int[] speed) {

        Map<Integer,Integer> positionSpeedMap = new HashMap<>();
        for (int i =0;i<position.length;i++){
            positionSpeedMap.put(position[i],speed[i]);
        }

        Arrays.sort(position);
        Stack<Integer> positionStack = new Stack<>();
        for (int j=position.length-1;j>=0;j--){
            if (positionStack.isEmpty()){
                positionStack.push(position[j]);
            }
            else {
                double timeToTarget = (target - position[j]) / (double)positionSpeedMap.get(position[j]);
                double previousTimeToTarget = (target - positionStack.peek()) / (double)positionSpeedMap.get(positionStack.peek());
                if (timeToTarget > previousTimeToTarget){
                    positionStack.push(position[j]);
                }
            }

        }

        return positionStack.size();
    }

    public static void main(String[] args) {


        System.out.println(new Carfleet().carFleet(12,new int[]{10,8,0,5,3},new int[]{2,4,1,1,3}));
        System.out.println(new Carfleet().carFleet(12,new int[]{3},new int[]{3}));
        System.out.println(new Carfleet().carFleet(100,new int[]{0,2,4},new int[]{4,2,1}));
    }

}
