package binary;

/**
         * https://leetcode.com/problems/koko-eating-bananas/
 *
 *
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
 *
 * Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
 *
 * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
 *
 * Return the minimum integer k such that she can eat all the bananas within h hours.
 *
 *
 *
 * Example 1:
 *
 * Input: piles = [3,6,7,11], h = 8
 * Output: 4
 */
public class EatBananas {

    /**
     * h must greater than piles.length
     * and    k >= 1 and k <= max(piles)
     *
     * @param piles
     * @param h
     * @return
     */

    public int minEatingSpeed(int[] piles, int h) {

        int low=1;
        int high = 0;
        for (int p : piles){
            if (p > high){
                high = p;
            }
        }
        int mid = 0;
        while (low <= high){
            mid = low + ((high - low) >> 1);

            long timeNeeded = 0;
            for (int p : piles){
                timeNeeded += p % mid == 0? p/mid : (p/mid) + 1;
            }

            if (timeNeeded > h){
                low = mid + 1;  //need a fast speed
            }
            else {
                high = mid -1; // need a slow speed
            }
        }
        return low;
    }
}
