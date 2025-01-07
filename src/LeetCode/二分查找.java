package LeetCode;

public class 二分查找 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        二分查找 aa = new 二分查找();
        System.out.println(aa.search2(nums,9));
    }

    public int search1(int[] nums, int target) {
        for (int i = 0 ; i < nums.length ; i++){
            if (target == nums[i]){
                return i;
            }
        }
        return -1;
    }

    public int search2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int middle = (right-left) / 2 + left;
            if (nums[middle] > target){
                right = middle-1;
            }else if (nums[middle] < target){
                left = middle+1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
