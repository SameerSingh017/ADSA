class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int[] prefix = new int[n+1];
        prefix[0] = 0;
        for(int i=0; i<n; i++){
            prefix[i+1] = prefix[i] + nums.get(i);
        }
        int minSum = Integer.MAX_VALUE;
        for(int i=0; i<nums.size(); i++){
            for(int j=i; j<nums.size(); j++){
                int len = j-i+1;
                if(len>=l && len<=r){
                    int sum = prefix[j+1] - prefix[i];
                    if(sum>0) minSum = Math.min(minSum, sum);
                }
            }
        }
        if(minSum == Integer.MAX_VALUE) return -1;
        else return minSum;
    }
}