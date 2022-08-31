package array;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequent {


    public int[] topKFrequent(int[] nums, int k) {


        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)){
                map.put(i,(int)map.get(i) + 1);
            } else {
                map.put(i,1);
            }

        }

        List<Integer> sortedValue = map.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        int kth = sortedValue.get(k-1);
        int[] result = new int[k];
        int i = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() >= kth){
                result[i++] = entry.getKey();
            }
        }
        return result;



    }


    public static void main(String[] args) {
        new TopKFrequent().topKFrequent(new int[]{3,0,1,0},1);
    }


}
