class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int num : nums){
            if(num%2==0){
                m.put(num, m.getOrDefault(num,0) + 1);
            }    
        }
        int maxFreq = 0;
        int ans = Integer.MAX_VALUE;
        for(Map.Entry<Integer , Integer> entry : m.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            if(maxFreq < freq || freq == maxFreq && num < ans){
                maxFreq = freq;
                ans = num;
            }
        }
        if(maxFreq == 0) return -1;
        return ans;
    }
}