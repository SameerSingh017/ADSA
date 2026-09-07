import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[n-1];
        for(int i=min; i<=max; i++){
            if(!set.contains(i)) result.add(i);
        }
        return result;
    }
}