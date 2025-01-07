package LeetCode;

public class $209长度最小的子数组 {
    public static void main(String[] args) {

    }

    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int mindate = Integer.MAX_VALUE;
        int i = 0 ;
        for (int j = 0 ; j < nums.length ; j++){
            sum += nums[j];
            while (sum >= target){
                mindate = Math.min(mindate,j-i+1);
                sum -= nums[i++];
            }

        }

        return mindate == Integer.MAX_VALUE ? 0 : mindate;

    }
}
