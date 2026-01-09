class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        Integer[] dp = new Integer[n];
        return Math.min(solve(0, cost, dp), solve(1, cost, dp));
    }

    private int solve(int i, int[] cost, Integer[] dp) {
        if (i >= cost.length) return 0;
        
        if (dp[i] != null) return dp[i];

        dp[i] = cost[i] + Math.min(solve(i + 1, cost, dp),
                                    solve(i + 2, cost, dp));
        return dp[i];
    }
}
