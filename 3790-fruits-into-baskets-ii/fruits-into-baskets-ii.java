class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int ans = 0;
        boolean[] filled = new boolean[n];
        for(int i=0; i<n; i++){
            boolean placed = false;
            for(int j=0; j<n; j++){
                if(baskets[j]>=fruits[i] && !filled[j]){
                    filled[j] = true;
                    placed = true;
                    break;
                }
            }
            if(!placed) ans++;
        }
        return ans;
    }
}