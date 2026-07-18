class Solution {
    public int longestSubarray(int[] nums) {
        int zeroes=0;
        int maxOnes = 0;
        int j =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                zeroes++;
            }
            while(zeroes>1){
                if(nums[j]==0){
                    zeroes--;
                }
                j++;
            }
            maxOnes = Math.max(maxOnes, i-j);
        }
        return maxOnes;
    }
}