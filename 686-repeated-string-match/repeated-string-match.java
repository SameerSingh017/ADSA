class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count = 1;
        String s = a;
        while(s.length()<b.length()){
            s+=a;
            count++;
        }
        if(s.contains(b)){
            return count;
        }
        s+=a;
        if(s.contains(b)){
            return count+1;
        }
        return -1;
    }
}