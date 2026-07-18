class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int sum = 0;
        for(int i=0; i<k; i++){
            sum+=nums[i];
        }
        double avg = (double) sum/k;
        double maxAvg = avg;
        for(int i=k; i<nums.length; i++){
            sum = sum - nums[i-k] + nums[i];
            double currAvg = (double) sum / k;
            maxAvg = Math.max(maxAvg, currAvg);
        }
        return maxAvg;
    }
}