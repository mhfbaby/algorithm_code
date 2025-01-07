package LeetCode;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class $1两数之和 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++){
            if (!hashMap.containsKey(target - nums[i])){
                hashMap.put(nums[i],i);
            }else {
                return new int[]{i,hashMap.get(target - nums[i])};
            }
        }
        return null;
    }
}
