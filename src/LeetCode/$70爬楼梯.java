package LeetCode;

public class $70爬楼梯 {
    public static void main(String[] args) {
        int n = 2;
        $70爬楼梯 a = new $70爬楼梯();
        System.out.println(a.climbStairs(n));
    }

    public int climbStairs(int n) {
        int[] arr = new int[n+2];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2 ; i < n+2 ; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n+1];
    }
}
