class Solution {
    public int reverseDegree(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int value = 26;
        for(char ch='a'; ch<='z'; ch++){
            map.put(ch, value);
            value--;
        }
        int i = 0;
        int a = 1;
        int sum = 0;
        while(i<s.length()){
            int prod = a * map.get(s.charAt(i));
            sum+=prod;
            i++;
            a++;
        }
        return sum;
    }
}