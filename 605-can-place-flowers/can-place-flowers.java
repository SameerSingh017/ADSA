class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        for(int i=0; i<len ; i++){
            if(flowerbed[i] == 0){
                boolean leftEmpty;
                boolean rightEmpty;
                if(i==0){
                    leftEmpty = true;
                }else{
                    leftEmpty = (flowerbed[i-1]==0);
                }

                if(i==len-1){
                    rightEmpty = true;
                }else{
                    rightEmpty = (flowerbed[i+1] == 0);
                }
                if(leftEmpty && rightEmpty){
                    flowerbed[i]=1;
                    n--;
                }
                if(n==0){
                    return true;
                }
            }
        }
        return n<=0;
    }
}