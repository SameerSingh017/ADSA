class Solution {
    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        Map<Integer, Integer> m = new HashMap<>();
        for(int num : nums){
            m.put(num, m.getOrDefault(num,0) + 1);
        } 
        int i = 0;
        for(int num : nums){
            if(m.get(num) == 1){
                result[i++] = num;
            }
        }
        return result;
    }
}