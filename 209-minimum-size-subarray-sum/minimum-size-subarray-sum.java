class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum=0;
        int j=0;
        int minCount=Integer.MAX_VALUE;;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            
            while(sum>=target){
                minCount = Math.min(minCount, i-j+1); 
                sum-=nums[j];
                j++;

            }    
        }
        if(minCount==Integer.MAX_VALUE) return 0;
        else return minCount;
    }
}