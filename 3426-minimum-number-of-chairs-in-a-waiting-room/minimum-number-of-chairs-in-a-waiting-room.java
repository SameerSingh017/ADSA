class Solution {
    public int minimumChairs(String s) {
        int currChairs = 0;
        int maxChair = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'E'){
                currChairs++;
            }else{
                currChairs--;
            }
            maxChair = Math.max(maxChair, currChairs);
        }
        return maxChair;

    }
}