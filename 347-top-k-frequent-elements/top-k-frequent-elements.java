class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> m = new HashMap<>();
        for(int num : nums){
            m.put(num, m.getOrDefault(num,0) +1);
        }
        List<Integer> list = new ArrayList<>(m.keySet());
        Collections.sort(list, (a,b) -> m.get(b) - m.get(a));
        for(int i=0 ; i<k ; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}