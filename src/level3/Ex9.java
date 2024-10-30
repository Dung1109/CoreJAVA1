package level3;

public class Ex9 {

    public static int maxSum(int[] a) {
        if (a.length == 0){
            return 0;
        } else if (a.length == 1){
            return a[0];
        }
        else if (a.length == 2) {
            return Math.max(a[0], a[1]);
        } else {

            int[] dp = new int[a.length];

            dp[0] = a[0];
            dp[1] = Math.max(a[0], a[1]);

            for (int i = 2; i < dp.length; i++) {
                dp[i] = Math.max(dp[i - 1], a[i] + dp[i - 2]);
            }
            return dp[a.length - 1];
        }
    }


    public static void main(String[] args) {
        int a[] = {1,3,5,7,9};
        Ex9 exercises = new Ex9();
        System.out.println("The max sum is: " + maxSum(a));
    }
}
