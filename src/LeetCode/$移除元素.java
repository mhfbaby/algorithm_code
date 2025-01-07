package LeetCode;

import java.util.Arrays;

public class $移除元素 {
    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        int t = nums.length;
        for (int i = 0 ; i < t ; i++){
            if (nums[i] == val){
                t--;
                for (int j = i ; j < nums.length-1 ; j++){
                    nums[j] = nums[j+1];
                }
                i--;
            }
        }
        return t;
    }

    //快慢指针
    public int removeElement2(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0 ; fast < nums.length ; fast++){
            if (nums[fast] != val){
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}
