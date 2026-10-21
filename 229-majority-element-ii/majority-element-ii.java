class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length / 3;
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) > n){
                result.add(key);
            }
        }
        return result;
        
    }
}