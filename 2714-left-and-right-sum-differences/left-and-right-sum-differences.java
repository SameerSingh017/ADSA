class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        leftSum[0] = 0;
        rightSum[nums.length -1] = 0;
        for(int i=1; i<nums.length; i++){
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }
        for(int i=nums.length-2; i>=0; i--){
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }
        for(int i=0 ; i<n ; i++){
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return result;


    }
}