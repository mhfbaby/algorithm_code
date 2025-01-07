package LeetCode;

import java.util.Arrays;

public class $977有序数组的平方 {
    public static void main(String[] args) {

    }

    public int[] sortedSquares(int[] nums) {
        for (int i = 0 ; i < nums.length ; i++){
            nums[i] = (int) Math.pow(nums[i],2 );
        }
        Arrays.sort(nums);
        return nums;
    }

    public int[] sortedSquares2(int[] nums) {
        int left = 0;
        int right = nums.length - 1 ;
        int[] nums2 = new int[nums.length];
        int t = nums.length - 1 ;
        while (left <= right){
            if (Math.pow(nums[left],2) >= Math.pow(nums[right],2)){
                nums2[t--] = (int) Math.pow(nums[left],2);
                left++;
            }else {
                nums2[t--] = (int) Math.pow(nums[right],2);
                right--;
            }
        }
        return nums2;
    }
}
