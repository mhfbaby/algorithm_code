package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class $1两数之和 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for ( int i = 0 ; i < nums.length ; i++){
            if (!map.containsKey(target - nums[i])){
                map.put(nums[i],i);
            }else {
                return new int[]{map.get(target-nums[i]),i};
            }
        }
        return new int[]{};
    }
}
