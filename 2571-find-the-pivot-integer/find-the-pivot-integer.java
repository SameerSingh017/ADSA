class Solution {
    public int pivotInteger(int n) {
        int totalsum = n * (n+1)/2;
        int x = (int) Math.sqrt(totalsum);
        if(x*x == totalsum) return x;
        return -1;
    }
}