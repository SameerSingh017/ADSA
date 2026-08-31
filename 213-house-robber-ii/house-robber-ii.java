class Solution {

    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        Integer[] dp1 = new Integer[n];
        int case1 = solve(1, n-1, nums, dp1);
        Integer[] dp2 = new Integer[n];
        int case2 = solve(0, n-2, nums, dp2);
        return Math.max(case1, case2);
    }

    private int solve(int i, int end, int[] nums, Integer[] dp) {
        if (i > end) return 0;  
        if (dp[i] != null) return dp[i];     

        int pick = nums[i] + solve(i + 2, end, nums, dp);
        int skip = solve(i + 1, end, nums, dp);

        return dp[i] = Math.max(pick, skip);
    }
}
