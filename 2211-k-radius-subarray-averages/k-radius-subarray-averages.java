class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n =nums.length;
        int[] avgs = new int[n];
        Arrays.fill(avgs, -1);
        int windowSize = 2*k+1;
        if(windowSize>n) return avgs;
        long sum = 0;
        for(int i=0; i<windowSize; i++){
            sum+=nums[i];
        }
        avgs[k] = (int) (sum/windowSize);
        
        for(int i=windowSize; i<n; i++){
            sum += nums[i];
            sum -= nums[i-windowSize];
            avgs[i-k] = (int) (sum/windowSize);
        }
        return avgs;
    }
}