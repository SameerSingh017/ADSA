class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        int ans =0;
        for(int i=0; i<=str.length()-k; i++){
            String sub = str.substring(i,i+k);
            int curr = Integer.parseInt(sub);
            if(curr != 0 && num % curr == 0){
                ans++;
            }
        }
        return ans;
    }
}