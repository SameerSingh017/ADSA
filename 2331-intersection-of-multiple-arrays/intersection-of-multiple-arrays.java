import java.util.*;

class Solution {

    public List<Integer> intersection(int[][] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        for (int[] arr : nums) {

            for (int num : arr) {

                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int key : map.keySet()) {

            if (map.get(key) == n) {
                ans.add(key);
            }
        }

        Collections.sort(ans);

        return ans;
    }
}