class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int i = coins.length - 1;
        Integer[][] dp = new Integer[i+1][amount + 1];
        int ans = solve(coins, i , amount, dp);
        if(ans == Integer.MAX_VALUE){
            return -1;
        }else{
            return ans;
        }
    }
    public int solve(int[] coins, int i , int amt, Integer[][] dp ){
        if(amt ==0 ) return 0;
        if(amt < 0 || i<0 ) return Integer.MAX_VALUE;

        if(dp[i][amt] != null) return dp[i][amt];

        int pick = solve(coins, i, amt - coins[i], dp);
        if(pick != Integer.MAX_VALUE){
            pick = 1 + pick;
        }
        int skip = solve(coins, i-1, amt, dp);

        dp[i][amt] = Math.min(pick, skip);

        return dp[i][amt];
    }
}