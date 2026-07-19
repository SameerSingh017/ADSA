class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0;
        int count=0;
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        int avg = sum / k;
        if(avg>=threshold) count++;
        for(int i=k; i<arr.length; i++){
            sum = sum - arr[i-k] + arr[i];
            int currAvg = sum /k;
            if(currAvg>=threshold) count++;
        }
        return count;
    }
}