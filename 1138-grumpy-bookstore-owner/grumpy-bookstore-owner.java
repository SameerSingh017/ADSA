class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int alreadySatisfied=0;
        for(int i=0; i<n ; i++){
            if(grumpy[i] == 0){
                alreadySatisfied+=customers[i];
            }
        }
        int extraSatisfied = 0;
        for(int i=0; i<minutes; i++){
            if(grumpy[i]==1){
                extraSatisfied+=customers[i];
            }
        }
        int maxExtra = extraSatisfied;
        for(int i=minutes; i< n ; i++ ){
            if(grumpy[i]==1){
                extraSatisfied += customers[i];
            }
            if(grumpy[i-minutes]==1){
                extraSatisfied -= customers[i-minutes];
            }
            maxExtra = Math.max(maxExtra, extraSatisfied);
        }
        return alreadySatisfied + maxExtra;
        
    }
}