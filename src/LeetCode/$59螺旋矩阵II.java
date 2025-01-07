package LeetCode;

public class $59螺旋矩阵II {
    public static void main(String[] args) {
        int[][] aaa = generateMatrix(6);
        for (int i = 0 ; i< aaa.length ; i++){
            for (int j = 0 ; j < aaa[i].length ; j++){
                System.out.print(aaa[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n) {
        int a1 = 0;
        int a2 = n-1;

        int b1 = 0;
        int b2 = n-1;

        int c1 = n-1;
        int c2 = 0;

        int d1 = n-1;
        int d2 = 0;


        int[][] nums = new int[n][n];
        if (n == 1){
            nums[0][0] = 1;
            return nums;
        }
        int t = 1;
        while (t < n*n){
            for (int i = a1 ; i < a2 ; i++){
                nums[b1][i] = t++;
            }
            for (int i = b1 ; i < b2 ; i++){
                nums[i][c1] = t++;
            }

            for (int i = c1 ; i > c2 ; i--){
                nums[d1][i] = t++;
            }
            for (int i = d1 ; i > d2 ; i--){
                nums[i][a1] = t++;
            }
            a1++;
            b1++;
            c1--;
            d1--;
            a2--;
            b2--;
            c2++;
            d2++;
        }
        if (n%2 != 0){
            nums[n/2][n/2] = n*n;
        }
        return nums;
    }
}
