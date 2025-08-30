class Solution {
    public static void moveZeroes(int[] nums) {
        int lastNonZero = 0; 

        // Step 1: Move all non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZero] = nums[i];
                lastNonZero++;
            }
        }

        // Step 2: Fill the remaining positions with zeros
        for (int i = lastNonZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);

        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}


