class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            if (map.containsKey(num)) {
                count += map.get(num); // already seen count
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}