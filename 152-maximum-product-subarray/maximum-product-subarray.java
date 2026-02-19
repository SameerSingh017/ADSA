class Solution {
    public int maxProduct(int[] nums) {
        int currMin = nums[0];
        int currMax = nums[0];
        int maxProd = nums[0];
        for(int i=1; i<nums.length; i++){
            int num = nums[i];
            if(num <0){
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }
            currMin = Math.min(currMin * num , num);
            currMax = Math.max(currMax * num, num);
            maxProd = Math.max(maxProd, currMax);
        }
        return maxProd;
    }
}