class Solution {
    public int mirrorDistance(int n) {
        int rev = reverse(n);
        return Math.abs(rev - n);
    }
    public int reverse(int num){
        int res = 0;
        while (num>0){
            res = res * 10 + num % 10;
            num /= 10; 
        }
        return res;
    }
}