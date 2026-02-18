class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int currMax = 0;
        int maxSum = nums[0];
        int currMin = 0;
        int minSum = nums[0];
        for (int num : nums){
            total += num;
            currMax = Math.max(currMax + num, num);
            maxSum = Math.max(maxSum, currMax);   
            currMin = Math.min(currMin +num, num);
            minSum = Math.min(minSum, currMin);         
        }
        if(maxSum < 0) return maxSum; 
        return Math.max(maxSum, total - minSum);
    }
}