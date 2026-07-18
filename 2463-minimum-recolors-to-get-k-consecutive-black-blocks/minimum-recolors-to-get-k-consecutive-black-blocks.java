class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minCount = Integer.MAX_VALUE;
        for(int i=0; i<=blocks.length()-k; i++){
            int count=0;
            for(int j=i; j<i+k; j++){
                if(blocks.charAt(j) == 'W'){
                    count++;
                } 
            }
            minCount = Math.min(minCount, count);
        }
        return minCount;
    }
}