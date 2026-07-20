class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        int n= nums.length;
        long sum=0;
        for(int i=0; i<k; i++){
            sum+=nums[i];
            m.put(nums[i], m.getOrDefault(nums[i],0)+1);
        }
        long maxSum = 0;
        if(m.size()==k) maxSum = sum; 
        for(int i=k; i<n; i++){
            sum-=nums[i-k];
            m.put(nums[i-k], m.get(nums[i-k]) - 1);
            if(m.get(nums[i-k])==0) m.remove(nums[i-k]);
            sum+=nums[i];
            m.put(nums[i], m.getOrDefault(nums[i],0)+1);
            if(m.size()==k){
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}