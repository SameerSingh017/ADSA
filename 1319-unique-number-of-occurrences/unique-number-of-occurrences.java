class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int num : arr){
            m.put(num, m.getOrDefault(num,0)+1);
        }
        Set<Integer> unique = new HashSet<>();

        for(int freq : m.values()){
            if(unique.contains(freq)){
                return false;
            }
            unique.add(freq);
        }
        return true;

    }
}