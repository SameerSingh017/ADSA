class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        Set<Integer> unique1 = new HashSet<>();
        Set<Integer> unique2 = new HashSet<>();
        for(int num : nums1){
            unique1.add(num);
        }
        for(int num : nums2){
            unique2.add(num);
        }
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for(int num: unique1){
            if(!unique2.contains(num)){
                l1.add(num);
            }
        }
        for(int num : unique2){
            if(!unique1.contains(num)){
                l2.add(num);
            }
        }
        answer.add(l1);
        answer.add(l2);
        return answer;
    }
}