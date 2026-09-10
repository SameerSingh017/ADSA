class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int carry = 0;
        int i = num.length-1;
        while(i>=0 || k>0 || carry>0){
            int digit = 0;
            if(i>=0){
                digit = num[i];
                i--;
            }
            int kdigit = k % 10;
            k/=10;
            int sum = digit + kdigit + carry;
            ans.add(sum%10);
            carry = sum /10;
        }
        Collections.reverse(ans);
        return ans;
    }
}