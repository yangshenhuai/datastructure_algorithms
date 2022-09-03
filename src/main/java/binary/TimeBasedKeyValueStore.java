package binary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/time-based-key-value-store/
 *
 *
 * Design a time-based key-value data structure that can store multiple values for the same key at different time stamps and retrieve the key's value at a certain timestamp.
 *
 * Implement the TimeMap class:
 *
 * TimeMap() Initializes the object of the data structure.
 * void set(String key, String value, int timestamp) Stores the key key with the value value at the given time timestamp.
 * String get(String key, int timestamp) Returns a value such that set was called previously, with timestamp_prev <= timestamp. If there are multiple such values, it returns the value associated with the largest timestamp_prev. If there are no values, it returns "".
 *
 *
 *Input
 * ["TimeMap", "set", "get", "get", "set", "get", "get"]
 * [[], ["foo", "bar", 1], ["foo", 1], ["foo", 3], ["foo", "bar2", 4], ["foo", 4], ["foo", 5]]
 * Output
 * [null, null, "bar", "bar", null, "bar2", "bar2"]
 *
 */
public class TimeBasedKeyValueStore {

}
class TimeMap {

    private Map<String, List<Integer>> keyTimeStampMap ;
    private Map<String,String> keyValMap ;
    public TimeMap() {
        keyTimeStampMap = new HashMap<>();
        keyValMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        keyValMap.put(timestamp + " " + key,value);
        keyTimeStampMap.computeIfAbsent(key, k-> new ArrayList<>()).add(timestamp);
    }

    public String get(String key, int timestamp) {
        List<Integer> stamps = keyTimeStampMap.get(key);
        if (stamps == null || stamps.isEmpty()){
            return "";
        }
        int low=0,high=stamps.size() - 1 ;
        int existedTimeStamp = -1;
        boolean lowChanged = false;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (timestamp < stamps.get(mid)){
                high = mid -1 ;
            } else if (timestamp > stamps.get(mid)){
                low = mid + 1;
                lowChanged = true;
            } else {
                existedTimeStamp = stamps.get(mid);
                break;
            }
        }

        if (existedTimeStamp == -1 ){
            if (stamps.get(lowChanged?low-1:low) > timestamp){
                return "";
            }
            existedTimeStamp = stamps.get(lowChanged?low-1:low);
        }

        return keyValMap.get(existedTimeStamp + " " + key);
    }
}