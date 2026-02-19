class Solution {
    public int largestAltitude(int[] gain) {
        int prefix[] = new int[gain.length+1];
        int max = 0;
        for(int i=0 ; i<gain.length; i++){
            prefix[i+1] = prefix[i] + gain[i];
            max = Math.max(max, prefix[i+1]);
        }
        return max;

    }
}

// class Solution {
//     public int largestAltitude(int[] gain) {
//         int max = 0;
//         for(int i=1 ; i<gain.length; i++){
//             gain[i] = gain[i-1] + gain[i];
//             max = Math.max(max, gain[i]);
//         }
//         return max;

//     }
// }