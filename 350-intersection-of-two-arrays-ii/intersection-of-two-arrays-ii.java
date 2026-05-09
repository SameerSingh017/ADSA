class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num : nums1){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();

        for(int num : nums2){
            if(mp.containsKey(num) && mp.get(num)>0){
                res.add(num);
                mp.put(num, mp.get(num) -1);
            }
        }

        int[] result = new int[res.size()];
        for(int i=0 ; i<res.size() ; i++){
            result[i] = res.get(i);
        }
        return result;
    }
}