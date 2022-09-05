package twopointer;


import java.util.*;

public class ThreeSum {


    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0 ;i < nums.length;i++){
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int target = -1 * nums[i];
            int j = i+1;
            int k = nums.length -1 ;
            while (j<k) {

                if (nums[j] + nums[k] < target) {
                    j++;
                } else if (nums[j] + nums[k] > target) {
                    k--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                }

            }
        }
        return new ArrayList<>(result);




    }



    public static void main(String[] args) {

        System.out.println(new ThreeSum().threeSum(new int[]{-1,0,1,2,-1,-4}));
        System.out.println(new ThreeSum().threeSum(new int[]{0,0,0}));
        System.out.println(new ThreeSum().threeSum(new int[]{1,-1,-1,0}));
        System.out.println(new ThreeSum().threeSum(new int[]{-2,0,1,1,2}));

    }
}
