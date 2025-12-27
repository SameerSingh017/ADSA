class Solution {
    public int minOperations(int[] nums, int k) {
        int totalsum = 0;
        for(int num : nums){
            totalsum += num;
        }
        int result = totalsum % k;
        return result;
    }
}