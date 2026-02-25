class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = new Integer[arr.length];

        for(int i=0; i<arr.length ; i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp, (a,b) -> {
            int BitsA = Integer.bitCount(a);
            int BitsB = Integer.bitCount(b);

            if(BitsA == BitsB){
                return a-b;
            };
            return BitsA - BitsB;
        });
        for(int i=0 ; i<arr.length; i++){
            arr[i] = temp[i];
        }
        return arr;
    }
}