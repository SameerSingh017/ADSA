class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(maxHelper(answerKey, k, 'T'), maxHelper(answerKey,k,'F'));
    }
    public int maxHelper(String s, int k, char target){
        int ans =0;
        int changes =0;
        int j=0;
        for(int i=0; i<s.length() ; i++){
            if(s.charAt(i) != target){
                changes++;
            }
            while(changes>k){
                if(s.charAt(j)!=target){
                    changes--;
                }
                j++;
            }
            ans = Math.max(ans, i-j+1);
        }
        return ans;
    }
}