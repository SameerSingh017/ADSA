class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += cardPoints[i];
        }
        int maxSum = sum;
        int j=k-1;
        for(int i=n-1; i>=n-k; i--){
            sum = sum + cardPoints[i] - cardPoints[j];
            maxSum = Math.max(maxSum, sum);
            j--;
        }
        return maxSum;
    }
}